package com.olga.command.manager;

import com.olga.command.Command;
import com.olga.dragon.Dragon;
import com.olga.i18n.Messenger;
import com.olga.print.api.Formatter;
import com.olga.print.api.Printer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Set;
import java.util.Stack;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class CommandManager {

    private Formatter formatter;
    private Messenger messenger;
    private Printer printer;
    private Stack<Dragon> mDataSet;

    public void executeUserCommand(String input) throws Exception {
        // Разделяем пользовательский ввод на команду и аргументы
        String[] array = input.split(" ");
        String commandName = array[0];

        // Аргументов должно быть либо 0, либо 1
        String args = array.length > 1 ? array[1] : null;

        String result = executeCommand(commandName, args);

        printResult(result);
    }

    public void printResult(String result) {
        printer.printResult(result);
    }

    public String executeCommand(String commandName, String args) throws Exception {

        Reflections reflections = new Reflections("com.olga.command");
        Set<Class<? extends Command>> classes = reflections.getSubTypesOf(Command.class);


        final Command[] command = new Command[1];
        classes.forEach(c -> {
            if(c.getSimpleName().toLowerCase().equals(commandName)) {
                try {
                    Constructor<? extends Command> constructor = c.getConstructor(Stack.class);
                    command[0] = constructor.newInstance(mDataSet);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        return command[0].execute(args);
    }

    public String executeCommand(String commandArgs) throws Exception {
        // Разделяем пользовательский ввод на команду и аргументы
        String[] array = commandArgs.split(" ");
        String commandName = array[0];

        // Аргументов должно быть либо 0, либо 1
        String args = array.length > 1 ? array[1] : null;

        return executeCommand(commandName, args);
    }
}
