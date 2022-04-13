package ru.bvkuchin.bdbot.BDBot.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.bvkuchin.bdbot.BDBot.bot.BDTelegramBot;

@Service
public class SendBotMessageServiceImpl implements SendBotMessageService {

    private final BDTelegramBot bdTelegramBot;

    @Autowired
    public SendBotMessageServiceImpl(BDTelegramBot bdTelegramBot) {
        this.bdTelegramBot = bdTelegramBot;
    }

    @Override
    public void sendMessage(String chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        try {
            bdTelegramBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


    }
}
