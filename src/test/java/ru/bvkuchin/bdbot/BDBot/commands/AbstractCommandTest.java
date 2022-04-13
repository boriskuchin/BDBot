package ru.bvkuchin.bdbot.BDBot.commands;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.bvkuchin.bdbot.BDBot.bot.BDTelegramBot;
import ru.bvkuchin.bdbot.BDBot.service.SendBotMessageService;
import ru.bvkuchin.bdbot.BDBot.service.SendBotMessageServiceImpl;

abstract public class AbstractCommandTest {

    protected BDTelegramBot bot = Mockito.mock(BDTelegramBot.class);
    protected SendBotMessageService sendBotMessageService = new SendBotMessageServiceImpl(bot);

    abstract String getCommandName();

    abstract String getCommandMessage();

    abstract Command getCommand();

    @Test
    public void shouldProperlyExecuteCommand() throws TelegramApiException {
//      given
        Long chatID = 1234567824356L;

        Update update = new Update();
        Message message = Mockito.mock(Message.class);
        Mockito.when(message.getChatId()).thenReturn(chatID);
        Mockito.when(message.getText()).thenReturn(getCommandName());
        update.setMessage(message);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatID.toString());
        sendMessage.setText(getCommandMessage());
        sendMessage.enableHtml(true);

//      when
        getCommand().execute(update);

//      then
        Mockito.verify(bot).execute(sendMessage);
    }
}
