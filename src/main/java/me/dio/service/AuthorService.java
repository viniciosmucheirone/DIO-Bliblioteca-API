package me.dio.service;

import me.dio.domain.model.Author;

public interface AuthorService {
	Author createAuthor(Author author);
	//Author getAuthor(Long id);
	
	Author getAuthorsByIds(Long id);
	
	Author updateAuthor(Long id, Author author);
	
	void deleteAuthor(Long id);
}


