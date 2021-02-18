package com.magalhaes_andre.validation.model;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Document {

	@CPF
	private String cpf;

	@CNPJ
	@Nullable
	private String cnpj;

	@TituloEleitoral
	@Nullable
	private String titulo;

	public Document(String cpf) {
		this.cpf = cpf;
	}

}
