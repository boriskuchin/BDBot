package ru.bvkuchin.bdbot.BDBot.commands;

import static ru.bvkuchin.bdbot.BDBot.commands.CommandName.NO;
import static ru.bvkuchin.bdbot.BDBot.commands.NoCommand.NO_MESSAGE;

public class NoCommandTest extends AbstractCommandTest{
    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }

}

