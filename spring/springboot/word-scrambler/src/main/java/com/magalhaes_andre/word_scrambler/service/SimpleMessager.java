package com.magalhaes_andre.word_scrambler.service;

import com.magalhaes_andre.word_scrambler.model.Message;
import org.springframework.stereotype.Service;

@Service
public class SimpleMessager implements Messager{

	private Message message;
	
	public SimpleMessager(Message message) {
		this.message = message;
	}
	
	@Override
	public Message getMessage() {
		return this.message;
	}
}
