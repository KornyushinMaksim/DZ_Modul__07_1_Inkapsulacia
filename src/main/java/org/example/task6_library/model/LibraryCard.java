package org.example.task6_library.model;

import java.util.ArrayList;

public class LibraryCard {
    private int numberCard;
    private Student student;
    private ArrayList<Record> records;

    public LibraryCard() {
        this.numberCard = 0;
        this.student = new Student();
        this.records = new ArrayList<>();
    }

    public LibraryCard(int numberCard, Student student) {
        this.numberCard = numberCard;
        this.student = student;
        this.records = new ArrayList<>();
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public void setRecord(Record record) {
        this.records.add(record);
    }

    public int getNumberCard() {
        return numberCard;
    }

    public ArrayList<Record> getRecords() {
        return records;
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
                "\nНомер билета: " + numberCard +
                "\n" + student +
                "\nЗаписи в читательском билете: " + records +
                '}';
    }
}
