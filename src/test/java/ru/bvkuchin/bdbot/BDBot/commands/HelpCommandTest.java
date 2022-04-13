package ru.bvkuchin.bdbot.BDBot.commands;

import static ru.bvkuchin.bdbot.BDBot.commands.CommandName.HELP;
import static ru.bvkuchin.bdbot.BDBot.commands.HelpCommand.HELP_MESSAGE;

public class HelpCommandTest extends AbstractCommandTest{
    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }

}
