package com.pos.casa.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RestNotFoundException extends RuntimeException {
	private String nome;
	private String descricao;
	private Object fieldValue;

	public RestNotFoundException(String nome, String descricao, Object fieldValue) {
		super(String.format("%s not found with %s : '%s'", nome, descricao, fieldValue));
		this.nome = nome;
		this.descricao = descricao;
		this.fieldValue = fieldValue;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setFieldValue(Object fieldValue) {
		this.fieldValue = fieldValue;
	}

	
}