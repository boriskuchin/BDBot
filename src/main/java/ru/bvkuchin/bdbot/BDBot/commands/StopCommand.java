package ru.bvkuchin.bdbot.BDBot.commands;

import org.telegram.telegrambots.meta.api.objects.Update;
import ru.bvkuchin.bdbot.BDBot.service.SendBotMessageService;

public class StopCommand implements iCommand {

    private final SendBotMessageService sendBotMessageService;

    private final String STOP_MESSAGE = "Привет. StopCommand";
    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), STOP_MESSAGE);
    }

    public StopCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }
}
