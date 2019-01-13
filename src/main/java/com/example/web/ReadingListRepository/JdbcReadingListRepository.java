package com.example.web.ReadingListRepository;
/**
 * @Author
 * @Date：Created in ${time} ${date}
 * @description
 * @Modified By
 * */

import com.example.domain.Book;
import org.flywaydb.core.internal.util.jdbc.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
class JdbcReadingListRepository implements ReadingListRepository {
    @Autowired
    JdbcTemplate jdbc;
    private Object isbn;

    /**
     * 注入JdbcTemplate
     */

    @Override
    public List<Book> findReader(String reader) {
        Object rs;
        jdbc.query(
                "Select id,reader,isbn,title,author,description" +
                        "from Book Where reader = ?",);
    }

    @Override
    public void save(Book book) throws SQLException {
        jdbc.update("insert into Book(reader,isbn,title,author,description)values(?,?,?,?,?)"),


    }

    public static void main(String[] args) {

    }

}
