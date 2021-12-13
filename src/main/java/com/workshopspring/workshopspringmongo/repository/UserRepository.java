package com.workshopspring.workshopspringmongo.repository;

import com.workshopspring.workshopspringmongo.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    
}
