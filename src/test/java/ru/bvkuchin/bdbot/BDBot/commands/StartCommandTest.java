package ru.bvkuchin.bdbot.BDBot.commands;


import static ru.bvkuchin.bdbot.BDBot.commands.CommandName.START;

import static ru.bvkuchin.bdbot.BDBot.commands.StartCommand.START_MESSAGE;

public class StartCommandTest extends AbstractCommandTest{
    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }

}
