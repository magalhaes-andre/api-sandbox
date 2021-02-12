package com.magalhaes_andre.word_scrambler.resource;

import com.magalhaes_andre.word_scrambler.model.Message;
import com.magalhaes_andre.word_scrambler.service.MessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magalhaes_andre.word_scrambler.service.Messager;
import com.magalhaes_andre.word_scrambler.service.ScrambledMessager;
import com.magalhaes_andre.word_scrambler.service.SimpleMessager;

@RestController
@RequestMapping("/messages")
public class MessageController {

	@Autowired
	private MessageHandler service;

	@PostMapping
	public Message createMessage(@RequestBody Message message){
		return service.handleMessageType(message);
	}
}
