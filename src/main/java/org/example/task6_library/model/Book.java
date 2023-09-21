package org.example.task6_library.model;

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book() {
        this.title = new String();
        this.author = new String();
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "\nBook{" +
                " Название книги: " + title +
                " Автор: " + author +
                '}';
    }
}
