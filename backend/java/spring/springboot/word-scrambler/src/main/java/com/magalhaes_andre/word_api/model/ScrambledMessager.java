package com.magalhaes_andre.word_api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScrambledMessager implements Messager{
	private String message;
	private Random random = new Random();
	
	public ScrambledMessager(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return scrambleMessage();
	}
	
	private String scrambleMessage() {
		StringBuffer scrambledMessage = new StringBuffer();
		List<Integer> usedIndexes = new ArrayList<>();
		
		for(int i=0; i<=message.length()-1;) {
			int index = random.nextInt(message.length());
			
			if(!usedIndexes.contains(index)) {
				usedIndexes.add(index);
				scrambledMessage.append(message.charAt(index));
				i++;
			}
		}
		return scrambledMessage.toString();
	}
}
