package ru.bvkuchin.bdbot.BDBot.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.bvkuchin.bdbot.BDBot.bot.BDTelegramBot;

@DisplayName("Unit-level testing for SendBotMessageService")
public class SendBotMessageServiceTest {

    private SendBotMessageService sendBotMessageService;
    private BDTelegramBot bdTelegramBot;

    @BeforeEach
    public void init() {
        bdTelegramBot = Mockito.mock(BDTelegramBot.class);
        sendBotMessageService = new SendBotMessageServiceImpl(bdTelegramBot);

    }

    @Test
    public void shouldProperlySendMessage() throws TelegramApiException {

        String chatId = "test_chat_id";
        String message = "test_message";

        SendMessage sendMessage = new SendMessage();
        sendMessage.enableHtml(true);
        sendMessage.setText(message);
        sendMessage.setChatId(chatId);

        sendBotMessageService.sendMessage(chatId, message);

        Mockito.verify(bdTelegramBot).execute(sendMessage);


    }
}
