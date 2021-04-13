package com.magalhaes_andre.word_scrambler.exception;

import com.magalhaes_andre.word_scrambler.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;

public class ConversionTypeNotSupported extends HttpClientErrorException {
    private final static String DEFAULT_MESSAGE = "This conversion type is not supported: ";
    private final static HttpStatus DEFAULT_STATUS = HttpStatus.BAD_REQUEST;

    public ConversionTypeNotSupported(Message message){
        super(DEFAULT_STATUS, DEFAULT_MESSAGE.concat(message.getConversionType().name()));
    }
}
