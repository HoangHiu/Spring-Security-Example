package org.myapp.spirngsecurityexample.controller;

import org.myapp.spirngsecurityexample.entity.Book.BookEntity;
import org.myapp.spirngsecurityexample.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v2/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping(value = "")
    public ResponseEntity<List<BookEntity>> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @PostMapping(value = "")
    public ResponseEntity<List<BookEntity>> getAllBooksPost(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }
}
