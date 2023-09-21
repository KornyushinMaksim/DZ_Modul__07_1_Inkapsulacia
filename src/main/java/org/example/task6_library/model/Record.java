package org.example.task6_library.model;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Record {
    private Book book;
    private LibraryCard card;
    private Calendar dateIssuance;
    private Calendar dateReturn;
    private int term;

    public Record() {
        this.book = new Book();
        this.dateIssuance = new GregorianCalendar();
        this.dateReturn = new GregorianCalendar();
        this.term = 0;
    }

    //конструктор для выдачи
    public Record(Book book, LibraryCard card, Calendar dateIssuance, int term) {
        this.book = book;
        this.card = card;
        this.dateIssuance = dateIssuance;
        this.dateReturn = null;
        this.term = term;
    }

    //конструктор для сдачи
//    public void returnRecord(Book book, LibraryCard card, Calendar dateReturn) {
//        this.book = book;
//        this.card = card;
//        this.dateReturn = dateReturn;
//    }

    public Book getBook() {
        return book;
    }

    public LibraryCard getCard() {
        return card;
    }

    public void setDateReturn(Calendar dateReturn) {
        this.dateReturn = dateReturn;
    }

    public void compare(){
        Calendar tmpDate = (Calendar) this.dateIssuance.clone();
        tmpDate.add(Calendar.DAY_OF_MONTH,term);
        if (this.dateReturn.compareTo(tmpDate) > 0){
            JOptionPane.showMessageDialog(null, "Вы должник!", "Сообщение",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public String toString() {
        if (dateReturn == null) {
            return "Record{" + book +
                    "\nНомер читательского билета: " + card.getNumberCard() +
                    "\nДата выдачи: " + dateIssuance.getTime() +
                    "\nСрок выдачи: " + term +
                    '}';
        } else {
            return "Record{" + book +
                    "\nНомер читательского билета: " + card.getNumberCard() +
                    "\nДата выдачи: " + dateIssuance.getTime() +
                    "\nДата сдачи: " + dateReturn.getTime() +
                    "\nСрок выдачи: " + term +
                    '}';
        }
    }
}
