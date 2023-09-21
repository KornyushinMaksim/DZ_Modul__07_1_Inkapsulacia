package org.example.task6_library.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Journal {
    private ArrayList<Record> records;

    public Journal() {
        this.records = new ArrayList<>();
    }

    public void setRecords(Record record) {
        this.records.add(record);
    }

    public ArrayList<Record> getRecords() {
        return records;
    }

    //создали запись и добавили еёе в жернал и читБилет
    public void addRecord(Book book, LibraryCard card, Calendar dateIssuance, int term){
        Record newRecord = new Record(book, card, dateIssuance, term);
        this.records.add(newRecord);
        card.setRecord(newRecord);
    }

    @Override
    public String toString() {
        return "Journal{" + records +
                '}';
    }
}
