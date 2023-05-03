package com.example.spring5webapp.services;

import com.example.spring5webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
