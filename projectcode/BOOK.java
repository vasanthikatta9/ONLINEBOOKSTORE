package com.bookstore;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private double price;
    private LocalDate publishDate;

    public Book(String title, String author, double price, LocalDate publishDate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    @Override
    public String toString() {
        return "Book{Title='" + title + "', Author='" + author + "', Price=" + price + ", Publish Date=" + publishDate + "}";
    }
}
