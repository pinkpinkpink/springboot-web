package com.example.domain;

import org.springframework.beans.factory.annotation.Value;

public class Book {
    @Value("")
    private String name;
    @Value("")
    private Long id;
    @Value("")
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
