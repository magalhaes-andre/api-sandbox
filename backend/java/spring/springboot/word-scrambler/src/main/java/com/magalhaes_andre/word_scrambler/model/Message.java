package com.magalhaes_andre.word_scrambler.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Message {

    private String content;
    @JsonAlias(value = "conversion")
    private ConversionType conversionType;

    public Message(){
        this.content = null;
        this.conversionType = null;
    }

    public Message(String content, ConversionType conversionType){
        this.content = content;
        this.conversionType = conversionType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ConversionType getConversionType() {
        return conversionType;
    }

    public void setConversionType(ConversionType conversionType) {
        this.conversionType = conversionType;
    }
}
