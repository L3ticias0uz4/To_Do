package com.list.To_Do.dto;

import java.time.LocalDate;

import com.list.To_Do.entities.Status;

import jakarta.validation.constraints.NotBlank;

public class TarefasDTO {
	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	private Status status;
	private LocalDate dtInicio;
	private LocalDate dtFim;
	
	public TarefasDTO() {
	}

	public TarefasDTO(String nome, String descricao,LocalDate dtInicio) {
		this.nome = nome;
		this.descricao = descricao;
		this.status = Status.PENDENTE;
		this.dtInicio = dtInicio;
	}


	public TarefasDTO(String nome, String descricao, Status status, LocalDate dtInicio,
			LocalDate dtFim) {
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public LocalDate getDtInicio() {
		return dtInicio;
	}


	public void setDtInicio(LocalDate dtInicio) {
		this.dtInicio = dtInicio;
	}


	public LocalDate getDtFim() {
		return dtFim;
	}


	public void setDtFim(LocalDate dtFim) {
		this.dtFim = dtFim;
	}
	
	
	
	
	
}
