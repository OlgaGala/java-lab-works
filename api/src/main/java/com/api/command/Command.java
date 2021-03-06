package com.api.command;

import com.api.entity.Dragon;
import com.api.exception.NoSuchCommandException;
import com.api.i18n.Messenger;
import com.api.i18n.MessengerFactory;
import com.api.message.MessageReq;
import com.api.print.api.Formatter;
import com.api.print.implementation.FormatterImpl;
import com.api.service.DragonService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.reflections.Reflections;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;
import java.util.Stack;

@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
public abstract class Command {

    private Messenger messenger = MessengerFactory.getMessenger();

    private Stack<Dragon> dragonList;

    private DragonService dragonService;

    private Formatter formatter;

    private Validator validator;

    public Command(Stack<Dragon> dragonList, DragonService dragonService) {

        this.dragonList = dragonList;
        this.dragonService = dragonService;

        this.formatter = new FormatterImpl();


        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public abstract Object execute(MessageReq message) throws Exception;

    protected String getArg(String command) {
        return command.split(" ")[1];
    }

    protected void settleIds() {
        int id = 0;
        for (Dragon d : dragonList) {
            d.setId(++id);
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
