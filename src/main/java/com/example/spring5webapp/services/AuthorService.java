package com.example.spring5webapp.services;

import com.example.spring5webapp.domain.Author;

public interface AuthorService{
    Iterable<Author> findAll();
}
