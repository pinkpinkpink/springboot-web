package com.example.web.ReadingListRepository;
/**
 * @Author
 * @Date：Created in ${time} ${date}
 * @description
 * @Modified By
 * */

import com.example.domain.Book;

import java.sql.SQLException;
import java.util.List;

public interface ReadingListRepository {
    List<Book> findReader(String reader);
    void save(Book book) throws SQLException;
}
