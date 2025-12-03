package com.list.To_Do.dto;

import com.list.To_Do.entities.Usuario;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UsuarioDTO {

	@Id
	private int id;
	@NotBlank
	private String nome;
	@NotBlank
	private String email;
	@NotNull
	private String senha;

	
	public UsuarioDTO(int id, @NotBlank String nome, @NotBlank String email, @NotNull String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public UsuarioDTO(@NotBlank String nome, @NotBlank String email, @NotNull String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public UsuarioDTO(Usuario user) {
		// TODO Auto-generated constructor stub
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
	
	
	
	
	
}
