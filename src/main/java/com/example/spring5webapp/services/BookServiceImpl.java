package com.example.spring5webapp.services;

import com.example.spring5webapp.domain.Book;
import com.example.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll(){
        return bookRepository.findAll();
    }
}
