package com.whorkshopmongo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whorkshopmongo.domain.Post;
import com.whorkshopmongo.domain.User;
import com.whorkshopmongo.repository.PostRepository;
import com.whorkshopmongo.service.exception.ObjectNotFoundException;


@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}