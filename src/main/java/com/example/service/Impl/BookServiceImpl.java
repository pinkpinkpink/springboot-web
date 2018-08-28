package com.example.service.Impl;

import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class BookServiceImpl implements BookService{

    //mock database
    private static Map<Long,Book> BOOK_DB= new HashMap<>();


    @Override
    public List<Book> findAll() {
        return new ArrayList<>(BOOK_DB.values());
    }

    @Override
    public Book insertByBook(Book book) {
        book.setId(BOOK_DB.size() + 1L);
        BOOK_DB.put(book.getId(),book);
        return book;
    }

    @Override
    public Book update(Book book) {
        BOOK_DB.put(book.getId(),book);
        return null;
    }

    @Override
    public Book delete(Book book) {
        return BOOK_DB.remove(book);
    }

    @Override
    public Book findById(long id) {
        return BOOK_DB.get(id);
    }
}
