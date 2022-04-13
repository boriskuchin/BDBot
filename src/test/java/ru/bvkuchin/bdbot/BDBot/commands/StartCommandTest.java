package ru.bvkuchin.bdbot.BDBot.commands;


import org.junit.jupiter.api.DisplayName;

import static ru.bvkuchin.bdbot.BDBot.commands.CommandName.START;

import static ru.bvkuchin.bdbot.BDBot.commands.StartCommand.START_MESSAGE;


@DisplayName("Unit-level testing for StartCommand")
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
