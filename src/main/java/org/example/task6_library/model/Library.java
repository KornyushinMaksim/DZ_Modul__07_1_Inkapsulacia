package org.example.task6_library.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Library {
    private Journal journal;
    private ArrayList<Book> books;
    private ArrayList<LibraryCard> cards;
    private int cnt;

    public Library() {
        this.journal = new Journal();
        this.books = new ArrayList<>();
        this.cards = new ArrayList<>();
        this.cnt = 1;
    }

    //добавление книги в библиотеку
    public void addBook(Book book) {
        if (book != null) {
            this.books.add(book);
        }
    }

    //выдача книги
    //удаляем из массива, создаём читБилет при необходимости, проверяя на null у студ.
    //создаём запись. Добавляем её в читБилет и в журнал(это прописано в методе addRecord)
    public void issuanceBook(String title, String author, Student student) {
        if (student.getCard() == null) {
            LibraryCard newCard = new LibraryCard(cnt++, student);
            student.setCard(newCard);
        }
        for (int i = 0; i < books.size(); i++) {
            Book tmpBook = books.get(i);
            if (tmpBook.getTitle().equals(title) && tmpBook.getAuthor().equals(author)) {
                books.remove(tmpBook);
                myDate newDate = new myDate();
                newDate.issDate();
                Record newRecord = new Record(tmpBook, student.getCard(), newDate.getDateIssuance(), newDate.getTerm());
                journal.setRecords(newRecord);
                student.getCard().setRecord(newRecord);
                this.cards.add(student.getCard());
            }
        }
    }

    public void returnBook(Book book, Student student) {
        this.books.add(book);
        myDate newDate = new myDate();
        newDate.retDate();
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getNumberCard() == student.getCard().getNumberCard()) {
                for (int j = 0; j < student.getCard().getRecords().size(); j++) {
                    if(book == student.getCard().getRecords().get(j).getBook()) {
                        cards.get(i).getRecords().get(j).setDateReturn(newDate.getDateReturn());
                    }//разобраться с индексами
                }
            }
            if (journal.getRecords().get(i).getCard().getNumberCard() == student.getCard().getNumberCard()){
                journal.getRecords().get(i).setDateReturn(newDate.getDateReturn());
            }
            journal.getRecords().get(i).compare();
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "\n\nКниги: " + books +
                "\n\nЖурнал: " + journal +
                "\n\nЧитательские билеты: " + cards +
                '}';
    }
}
