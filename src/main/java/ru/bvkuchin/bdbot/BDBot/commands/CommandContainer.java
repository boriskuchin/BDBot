package ru.bvkuchin.bdbot.BDBot.commands;


import com.google.common.collect.ImmutableMap;
import ru.bvkuchin.bdbot.BDBot.service.SendBotMessageService;

import static ru.bvkuchin.bdbot.BDBot.commands.CommandName.*;

public class CommandContainer {

    private final ImmutableMap<String, iCommand> commandMap;
    private final iCommand unknownCommand;

    public CommandContainer(SendBotMessageService sendBotMessageService) {
        commandMap = ImmutableMap.<String, iCommand>builder()
                .put(START.getCommandName(), new StartCommand(sendBotMessageService))
                .put(STOP.getCommandName(), new StopCommand(sendBotMessageService))
                .put(HELP.getCommandName(), new HelpCommand(sendBotMessageService))
                .put(NO.getCommandName(), new NoCommand(sendBotMessageService))
                .build();

        unknownCommand = new UnknownCommand(sendBotMessageService);
    }

    public iCommand retrieveCommand(String commandIdentifier) {
        return commandMap.getOrDefault(commandIdentifier, unknownCommand);
    }

}
