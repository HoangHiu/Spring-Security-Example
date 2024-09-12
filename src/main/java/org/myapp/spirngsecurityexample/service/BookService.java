package org.myapp.spirngsecurityexample.service;

import org.myapp.spirngsecurityexample.entity.Book.BookEntity;
import org.myapp.spirngsecurityexample.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<BookEntity> getAllBooks(){
        return bookRepository.findAll();
    }
}
