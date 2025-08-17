package com.bookstore;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookStore {

    private List<Book> books;

    public BookStore() {
        books = new ArrayList<>();
        books.add(new Book("Java Programming", "Geek1", 39.99, LocalDate.of(2021, 1, 15)));
        books.add(new Book("Learning Java 8", "Geek2", 49.99, LocalDate.of(2020, 5, 10)));
        books.add(new Book("Advanced Java", "Geek3", 59.99, LocalDate.of(2021, 8, 20)));
        books.add(new Book("Spring Framework", "Geek4", 29.99, LocalDate.of(2019, 11, 30)));
    }

    // Filtering books based on price
    public List<Book> filterBooksByPrice(double maxPrice) {
        return books.stream()
                .filter(book -> book.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    // Grouping books by year
    public Map<Integer, List<Book>> groupBooksByYear() {
        return books.stream()
                .collect(Collectors.groupingBy(book -> book.getPublishDate().getYear()));
    }

    // Searching books by title using Optional
    public Optional<Book> searchBookByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .findFirst();
    }

    // Display all books
    public void displayBooks() {
        books.forEach(System.out::println);
    }
}