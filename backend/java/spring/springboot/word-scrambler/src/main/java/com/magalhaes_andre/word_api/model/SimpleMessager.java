package com.magalhaes_andre.word_api.model;

public class SimpleMessager implements Messager{
	private String message;
	
	public SimpleMessager(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
}
