package ru.bvkuchin.bdbot.BDBot.commands;

import static ru.bvkuchin.bdbot.BDBot.commands.CommandName.STOP;
import static ru.bvkuchin.bdbot.BDBot.commands.StopCommand.STOP_MESSAGE;


public class StopCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }


}
