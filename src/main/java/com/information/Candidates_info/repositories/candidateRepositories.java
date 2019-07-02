package com.information.Candidates_info.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.information.Candidates_info.model.candidates;

public interface candidateRepositories  extends MongoRepository<candidates, String>{
	
	candidates findBy_id(ObjectId _id);
}
