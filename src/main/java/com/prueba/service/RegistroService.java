package com.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.Usuario;
import com.prueba.repository.RegistroRepository;

@Service
public class RegistroService {
	
	@Autowired
	private RegistroRepository repo;
	
	public Usuario saveCliente(Usuario usuario) {
		
		return repo.save(usuario);
	
	}

	public Usuario fetchClienteByEmail(String email) {
	
		return repo.findByEmail(email);
	}

	public Usuario fetchClienteByEmailAndPassword(String email,String password) {
		
		return repo.findByEmailAndPassword(email, password);
	}
	
	public Usuario fetchClienteByUsuario(String usuario) {
		
		return repo.findByUsuario(usuario);
	}
	
	

}
