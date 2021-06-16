package com.wfr.projetoworkshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfr.projetoworkshopmongodb.domain.User;
import com.wfr.projetoworkshopmongodb.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll () {
		
		return repo.findAll();
	}	
}