package org.example.Task6_labrary.model;

import java.util.ArrayList;
import java.util.Calendar;

public class LibraryCard {
    private int numberCard;
    private Student student;
    private ArrayList<Record> records;

    public LibraryCard() {
        numberCard = 0;
        this.student = new Student();
    }

    public LibraryCard(int numberCard, Student student) {
        this.numberCard = numberCard;
        this.student = student;
        this.records = new ArrayList<>();
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void addIssuanceRecordCard(Book book, LibraryCard card, Calendar dateOfIssue, int term) {
        if (book != null) {
            Record record = new Record(book, card, dateOfIssue, term);
            records.add(record);
        }
    }

    @Override
    public String toString() {
        return "\nLibraryCard {" +
                "\nНомер карты: " + numberCard +
                ", \nСтудент: " + student +
                '}';
    }
}
