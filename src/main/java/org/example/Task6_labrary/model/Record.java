package org.example.Task6_labrary.model;

import java.util.Calendar;

public class Record {
    private Calendar dateOfIssue;
    private Calendar dateReturn;
    private int term;
    private String titleBook;
    private String authorBook;
    private int numberCard;

    public Record() {
    }

    public Record(Book book, LibraryCard card, Calendar dateOfIssue, int term) {
        this.titleBook = book.getTitle();
        this.authorBook = book.getAuthor();
        this.numberCard = card.getNumberCard();
        this.dateOfIssue = dateOfIssue;
        this.term = term;
    }

    public Record(Book book, LibraryCard card, Calendar dateReturn) {
        this.titleBook = book.getTitle();
        this.authorBook = book.getAuthor();
        this.numberCard = card.getNumberCard();
        this.dateReturn = dateReturn;
    }

    @Override
    public String toString() {
        if (dateReturn == null) {
            return "\nJournal {" +
                    "\nДата выдачи: " + dateOfIssue.getTime() +
//                ", \nДата возврата: " + dateReturn.getTime() +
                    ", \nСрок выдачи: " + term +
                    ", \nНазвание книги: " + titleBook +
                    ", \nАвтор: " + authorBook +
                    ", \nНомер читательского билета: " + numberCard +
                    '}';
        } else {
            return "\nJournal {" +
                    "\nДата выдачи: " + dateOfIssue.getTime() +
                    ", \nДата возврата: " + dateReturn.getTime() +
                    ", \nСрок выдачи: " + term +
                    ", \nНазвание книги: " + titleBook +
                    ", \nАвтор: " + authorBook +
                    ", \nНомер читательского билета: " + numberCard +
                    '}';

        }
    }

//    public String returnToString() {
//        return "\nJournal {" +
//                "\nДата выдачи: " + dateOfIssue.getTime() +
//                ", \nДата возврата: " + dateReturn.getTime() +
//                ", \nСрок выдачи: " + term +
//                ", \nНазвание книги: " + titleBook +
//                ", \nАвтор: " + authorBook +
//                ", \nНомер читательского билета: " + numberCard +
//                '}';
//    }
//
//    public String issueToString() {
//        return "\nJournal {" +
//                "\nДата выдачи: " + dateOfIssue.getTime() +
//                ", \nСрок выдачи: " + term +
//                ", \nНазвание книги: " + titleBook +
//                ", \nАвтор: " + authorBook +
//                ", \nНомер читательского билета: " + numberCard +
//                '}';
//    }
}
