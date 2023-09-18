package org.example.Task6_labrary.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Journal {
    Record record;
    private ArrayList<Record> records;

    public Journal(Record record) {
        this.record = record;

    }

    public void addIssuanceRecordJournal(Book book, LibraryCard card, Calendar dateOfIssue, int term) {
        if (book != null) {
            record = new Record(book, card, dateOfIssue, term);
            records.add(record);
        }
    }

    public void addReturnRecordJournal(Book book, LibraryCard card, Calendar dateReturn){
        record = new Record(book, card, dateReturn);
        records.add(record);
    }

}
