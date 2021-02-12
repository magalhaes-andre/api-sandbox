package com.magalhaes_andre.word_scrambler.service;

import com.magalhaes_andre.word_scrambler.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service

public class ScrambledMessager implements Messager{

	private Message message;
	private Random random = new Random();
	
	public ScrambledMessager(Message message) {
		this.message = message;
	}
	
	@Override
	public Message getMessage() {
		return scrambleMessage();
	}
	
	private Message scrambleMessage() {
		String messageToScramble = message.getContent();
		StringBuffer scrambledMessage = new StringBuffer();
		List<Integer> usedIndexes = new ArrayList<>();
		
		for(int i=0; i<=messageToScramble.length()-1;) {
			int index = random.nextInt(messageToScramble.length());
			
			if(!usedIndexes.contains(index)) {
				usedIndexes.add(index);
				scrambledMessage.append(messageToScramble.charAt(index));
				i++;
			}
		}

		message.setContent(scrambledMessage.toString());
		return message;
	}
}
