package com.magalhaes_andre.basicrestapi.service;

import com.magalhaes_andre.word_scrambler.model.ConversionType;
import com.magalhaes_andre.word_scrambler.model.Message;
import com.magalhaes_andre.word_scrambler.service.SimpleMessager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleMessagerTest {

    private SimpleMessager messager;
    private static final Message TEST_MESSAGE = new Message("Test Message", ConversionType.SIMPLE);

    @Before
    public void init (){
        messager = new SimpleMessager(TEST_MESSAGE);
    }

    @Test
    public void messageGetsReturnedAsSended(){
        Message message = messager.getMessage();

        Assert.assertTrue(message.getContent().equals(TEST_MESSAGE));
    }
}
