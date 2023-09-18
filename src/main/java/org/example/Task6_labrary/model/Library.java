package org.example.Task6_labrary.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<LibraryCard> cards;
    private Journal journal;

    public Library() {
        this.books = new ArrayList<>();
        this.cards = new ArrayList<>();
    }

    public Library(ArrayList<Book> books, ArrayList<LibraryCard> cards) {
        this.books = books;
        this.cards = cards;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book issuanceBook(String title, String author) {
        for (int i = 0; i < books.size(); i++) {
            Book tmpBook = books.get(i);
            if (tmpBook.getTitle().equals(title) && tmpBook.getAuthor().equals(author)) {
                books.remove(i);
                return tmpBook;
            }
        }
        return null;
    }

    public void returnBook(Book book, LibraryCard libraryCard){

    }

    @Override
    public String toString() {
        return "\nLibrary{ " +
                "\nКниги: " + books +
                ", \nЗаписи: " + cards +
                '}';
    }

    public String bookToString(){
        return "\nНаличие книг:" + books;
    }

    public String jornalToString(){
        return "\nЗаписи в журнале:" + cards;
    }
}
