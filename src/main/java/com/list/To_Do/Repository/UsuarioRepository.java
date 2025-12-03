package com.list.To_Do.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.list.To_Do.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> { 

    Usuario findByEmail(String email);
}



