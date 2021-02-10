package com.magalhaes_andre.validation.api;

import org.hibernate.validator.constraints.br.CPF;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.validation.annotation.Validated;

import junit.framework.Assert;

@SpringBootTest
@Validated
public class ReceiverTests {

	@Test
	public void shouldBeValidCPF() {
		@CPF
		String cpf = "6";
		
		Assert.assertEquals(false, cpf.isEmpty());
	}
}
