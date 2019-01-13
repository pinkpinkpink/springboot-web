package com.example.dao;

import com.example.domain.Reader;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ReaderDao {

    @Select("Select * from reader")
    @Results({
            @Result(property = "readername",column = "name" ),
            @Result(property = "sex",column = "sex"),
            @Result(property = "readerage",column = "age"),
            @Result(property = "address",column = "address"),
    })
    Reader findByName(@Param("readername")String name);
}
