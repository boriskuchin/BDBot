package ru.bvkuchin.bdbot.BDBot.commands;

import org.telegram.telegrambots.meta.api.objects.Update;
import ru.bvkuchin.bdbot.BDBot.service.SendBotMessageService;

public class NoCommand implements iCommand {
    private final SendBotMessageService sendBotMessageService;

    public static final String NO_MESSAGE = "Я поддерживаю команды, начинающиеся со слеша(/).\n"
            + "Чтобы посмотреть список команд введите /help";

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), NO_MESSAGE);
    }

    public NoCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }
}
