package com.example.web;

import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBookList(){return bookService.findAll();}

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Book postBook(@RequestBody Book book){return bookService.insertByBook(book);}

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public Book deleteBook(@RequestBody Book book){return bookService.delete(book);}

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public Book updateBook(@RequestBody Book book){return bookService.update(book);}
}
