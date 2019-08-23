package com.workshop.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.workshop.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	// Isto é um query method, é um metodo definido
	// automaticamente no spring-data a partir do 'sufixo' no nome do método
	// Ex: 'Containing' 'After' 'Before' 'In' 'IgnoreCase'
	List<Post> findByTitleContainingIgnoreCase(String text);
}
