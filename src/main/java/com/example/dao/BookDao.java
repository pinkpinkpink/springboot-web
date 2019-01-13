package com.example.dao;

import com.example.domain.Book;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

public interface BookDao {
    @Select("Select * from book")
    @Results({
            @Result(property = "title",column = "title"),
            @Result(property = "id",column = "id"),
            @Result(property = "isbn",column = "isdn"),
            @Result(property = "author",column = "author"),
            @Result(property = "description",column = "description"),
    })
    Book findById(@Param("id") Integer id);
}
