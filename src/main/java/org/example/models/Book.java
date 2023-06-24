package org.example.models;

import javax.validation.constraints.*;

public class Book {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotEmpty(message = "Please enter the book name")
    @Size(min = 1, max = 100, message = "Title size should be between 1 and 100")
    private String title;
    @Size(min = 2, max = 100, message = "Author name should be between 2 and 100")
    @NotEmpty(message = "Please enter the author name")
    private String author;
    private int year;

    public Book(){}
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
