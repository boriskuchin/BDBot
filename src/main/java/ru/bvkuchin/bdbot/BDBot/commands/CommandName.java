package ru.bvkuchin.bdbot.BDBot.commands;

public enum CommandName {
    START("/start"),
    STOP("/stop"),
    HELP("/help"),
    NO("/");

    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return this.commandName;
    }


}
