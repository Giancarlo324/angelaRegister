package com.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.entity.Usuario;

@Repository
public interface RegistroRepository extends JpaRepository<Usuario,Integer>{
	
	public Usuario findByEmail(String email);
	
	public Usuario findByEmailAndPassword(String email, String password);

	public Usuario findByUsuario(String usuario);

}
