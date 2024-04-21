package br.com.arq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.arq.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private final UsersRepository repository;

	public UsersService(UsersRepository repository) {
		this.repository = repository;
	}

    
	 
	 
	
	
}
