package com.api.command;

import com.api.entity.Dragon;
import com.api.message.MessageReq;
import com.api.service.DragonService;
import lombok.Getter;
import lombok.Setter;

import java.util.Stack;

@Getter @Setter
public class RemoveAtIndex extends Command {

    public RemoveAtIndex(Stack<Dragon> dragonList, DragonService dragonService) {
        super(dragonList, dragonService);
    }

    @Override
    public Stack<Dragon> execute(MessageReq message) {

        int index = Integer.parseInt(getArg(message.getCommand()));

        for (int i = 0; i < getDragonList().size(); i++) {
            if(index == i && getDragonService().delete(getDragonList().get(i), message.getUser())) {
                getDragonList().remove(getDragonList().get(i));
            }
        }

        return getDragonList();
    }

    @Override
    public String toString() {
        return super.toString() + ": " + getMessenger().getMessage("infoRemoveAtIndex");
    }
}
