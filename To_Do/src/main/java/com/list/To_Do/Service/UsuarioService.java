package com.list.To_Do.Service;

import com.list.To_Do.Repository.UsuarioRepository;
import com.list.To_Do.dto.UsuarioDTO;
import com.list.To_Do.entities.Usuario;

public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;
	
	public UsuarioService (UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;	
	}
	
	public UsuarioDTO criarUsuario(UsuarioDTO dto) {
		
		Usuario user = new Usuario(dto);
		usuarioRepository.save(user);
		UsuarioDTO udto = new UsuarioDTO(user);
		return udto;
		
		
	}

}
