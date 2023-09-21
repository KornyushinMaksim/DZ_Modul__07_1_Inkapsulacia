package org.example.task6_library.model;

import javax.swing.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class myDate {
    private Calendar dateIssuance;
    private Calendar dateReturn;
    private int term;

    public myDate(){
        this.dateIssuance = null;
        this.dateReturn = null;
        this.term = 0;
    }

    //дата выдачи книги
    public void issDate() {
        String dateIss = JOptionPane.showInputDialog(null, "Дата выдачи\n(формат даты гггг-мм-дд)",
                "Выдача", JOptionPane.PLAIN_MESSAGE);
        String[] date = dateIss.split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        this.dateIssuance = new GregorianCalendar(year, month - 1, day);
        this.term = Integer.parseInt(JOptionPane.showInputDialog(null, "Срок выдачи",
                "Выдача", JOptionPane.PLAIN_MESSAGE));
    }

    //дата сдачи книги
    public void retDate(){
        String dateRet = JOptionPane.showInputDialog(null, "Дата возврата\n(формат даты гггг-мм-дд)",
                "Выдача", JOptionPane.PLAIN_MESSAGE);
        String[] date = dateRet.split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        this.dateReturn = new GregorianCalendar(year, month - 1, day);
    }

    public void setDateIssuance(Calendar dateIssuance) {
        this.dateIssuance = dateIssuance;
    }

    public void setDateReturn(Calendar dateReturn) {
        this.dateReturn = dateReturn;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public Calendar getDateIssuance() {
        return dateIssuance;
    }

    public Calendar getDateReturn() {
        return dateReturn;
    }

    public int getTerm() {
        return term;
    }


//    @Override
//    public String toString() {
//        if(dateReturn == null) {
//            return "myDate{" +
//                    "dateIssuance=" + dateIssuance.getTime() +
//                    ", term=" + term +
//                    '}';
//        } else {
//            return "myDate{" +
//                    "dateIssuance=" + dateIssuance.getTime() +
//                    ", dateReturn=" + dateReturn.getTime() +
//                    ", term=" + term +
//                    '}';
//        }
//    }
}
