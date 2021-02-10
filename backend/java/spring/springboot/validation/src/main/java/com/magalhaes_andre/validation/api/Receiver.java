package com.magalhaes_andre.validation.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magalhaes_andre.validation.model.Document;

@RestController
@RequestMapping("/")
public class Receiver {

	@PostMapping("document/")
	public Document receivesDocument(@Valid @RequestBody Document receivedDocument) {
		return receivedDocument;
	}
}
