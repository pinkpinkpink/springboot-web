package com.example.service;
/**
 * @Author
 * @Date：Created in ${time} ${date}
 * @description
 * @Modified By
 * */

import com.example.domain.Reader;

import java.util.List;

public interface ReaderService {
    /**
     * @return
     */
    List<Reader> finndAll();

    /**
     *
     * @param reader
     * @return add new book
     */
    Reader insertBook(Reader reader);

    /**
     *
     * @param reader
     * @apiNote delete reader
     * @return
     *
     */
    Reader delete(Reader reader);

    /**
     *
     * @param reader
     * @return uodate reader message
     */
    Reader update(Reader reader);

    /**
     *
     * @param reader
     * @return
     */
    Reader findByReader(Reader reader);
}
