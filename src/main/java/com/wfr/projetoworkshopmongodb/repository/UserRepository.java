package com.wfr.projetoworkshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wfr.projetoworkshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	
}