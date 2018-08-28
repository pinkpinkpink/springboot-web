package com.example.service;

import com.example.domain.Book;


import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book insertByBook(Book book);
    Book update(Book book);

    Book delete(Book book);
    Book findById(long id);

}
