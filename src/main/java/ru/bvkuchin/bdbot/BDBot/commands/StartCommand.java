package ru.bvkuchin.bdbot.BDBot.commands;

import org.telegram.telegrambots.meta.api.objects.Update;
import ru.bvkuchin.bdbot.BDBot.service.SendBotMessageService;

public class StartCommand implements iCommand {

    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "Привет. Тест StartCommand";


    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
