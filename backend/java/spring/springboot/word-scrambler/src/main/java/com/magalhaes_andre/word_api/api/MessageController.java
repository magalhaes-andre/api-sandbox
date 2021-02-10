package com.magalhaes_andre.word_api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magalhaes_andre.word_api.model.Messager;
import com.magalhaes_andre.word_api.model.ScrambledMessager;
import com.magalhaes_andre.word_api.model.SimpleMessager;

@RestController
@RequestMapping("/messages")
public class MessageController {

	@GetMapping("")
	public String getInstructions(){
		return "For proper usage, specify in the URI: '/messages/{simple} or {scrambled}/{message}'";
	}
	@GetMapping("/simple/{message}")
	public String getSimpleMessage(@PathVariable String message){
		Messager messager = new SimpleMessager(message);
		return messager.getMessage();
	}
	
	@GetMapping("/scrambled/{message}")
	public String getScrambledMessage(@PathVariable String message) {
		Messager messager = new ScrambledMessager(message);
		return messager.getMessage();
	}
}
