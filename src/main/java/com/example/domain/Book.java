package com.example.domain;

import org.springframework.beans.factory.annotation.Value;

public class Book {
    public Object reader;
    public Object isbn;
    @Value("")
    private String title;
    @Value("")
    private Long id;
    @Value("")
    private String author;

    @Value("")
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
