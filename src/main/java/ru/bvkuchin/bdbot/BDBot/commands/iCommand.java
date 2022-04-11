package ru.bvkuchin.bdbot.BDBot.commands;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface iCommand {
    void execute(Update update);
}
