package com.list.To_Do.entities;

import com.list.To_Do.dto.UsuarioDTO;

import jakarta.persistence.Column;

public class Usuario {

	
	private int id;
	private String nome;
	@Column(unique = true)
	private String email;
	private String senha;
	
	
	public Usuario(UsuarioDTO dto) {
		this.nome = dto.getNome();
		this.email = dto.getEmail();
		this.senha = dto.getSenha();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Usuario() {
		
	}
	public Usuario(int id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
}
	
	
