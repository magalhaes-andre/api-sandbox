package com.magalhaes_andre.word_scrambler.service;

import com.magalhaes_andre.word_scrambler.exception.ConversionTypeNotSupported;
import com.magalhaes_andre.word_scrambler.model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageHandler {

    private Messager messager;

    public MessageHandler(){}

    public Message handleMessageType(Message message) {
        switch (message.getConversionType()) {
            case SIMPLE:
                messager = new SimpleMessager(message);
                break;
            case SCRAMBLE:
                messager = new ScrambledMessager(message);
                break;
            default:
                throw new ConversionTypeNotSupported(message);
        }

        return messager.getMessage();
    }
}
