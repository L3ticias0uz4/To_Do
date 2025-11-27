package com.list.To_Do.entities;

import java.time.LocalDate;

import com.list.To_Do.dto.TarefasDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private String descricao;
	private Status status;
	private LocalDate dtInicio;
	private LocalDate dtFim;
	
	public Tarefas() {
	}
	
	
	public Tarefas(TarefasDTO dto) {
		this.nome = dto.getNome();
		this.descricao = dto.getDescricao();
		this.status = dto.getStatus();
		this.dtInicio = LocalDate.now();
	}
	
	public Tarefas(String nome, String descricao, Status status) {
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
	}
	
	
	public Tarefas(long id, String nome, String descricao, Status status, LocalDate dtInicio, LocalDate dtFim) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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


















