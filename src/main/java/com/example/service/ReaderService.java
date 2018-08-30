package com.example.service;/*
 * @Author
 * @Date：Created in ${time} ${date}
 * @description
 * @Modified By
 * */

import com.example.domain.Book;
import com.example.domain.Reader;

import java.util.List;

public interface ReaderService {
    List<Reader> finndAll();
    Reader insertBook(Reader reader);
    Reader delete(Reader reader);
    Reader update(Reader reader);
    Reader findByReader(Reader reader);
}
