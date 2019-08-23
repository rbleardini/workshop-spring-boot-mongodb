package com.workshop.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.workshopmongo.domain.Post;
import com.workshop.workshopmongo.repository.PostRepository;
import com.workshop.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired //mecanismo de injecao de dependencia automatica do spring
	private PostRepository repo; 
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
	
	public List<Post> findByTitle(String text){
		return repo.findByTitleContaining(text);
	}
}
