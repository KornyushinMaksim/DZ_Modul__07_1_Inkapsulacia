//      В библиотеке решили автоматизировать учет книг, выданных студентам.
//        Студент, для того чтобы получить книгу, должен получить читательский билет,
//        если не получал ранее. В читательском билете содержится информация:
//        ■ номер билета;
//        ■ фамилия и имя студента;
//        ■ номер группы.
//        При выдаче книги библиотекарь фиксирует в журнале:
//        ■ название и автора книги;
//        ■ номер билета, на который выдана книга;
//        ■ дата выдачи;
//        ■ на какое время выдана книга (в сутках).
//        При приеме книги библиотекарь фиксирует в журнале:
//        ■ название и автора книги;
//        ■ номер билета студента, который вернул книгу;
//        ■ дата возврата.
//        Разработать модель программы, которая бы позволила находить должников
//        (студентов, которые не сдали книгу вовремя).

package org.example.Task6_labrary;

import org.example.Task6_labrary.model.Book;
import org.example.Task6_labrary.model.Library;
import org.example.Task6_labrary.model.LibraryCard;
import org.example.Task6_labrary.model.Student;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("Иваношвили", "Гурджа", "Г-34");
        Student stu2 = new Student("Иванов", "Дмитрий", "С-22");
        Student stu3 = new Student("Лукьянова", "Даша", "Г-34");
        Student stu4 = new Student("Филимонова", "Маша", "С-22");

        Book b1 = new Book("Война и мир", "Л.Н.Толстой");
        Book b2 = new Book("Анна Каренина", "Л.Н.Толстой");
        Book b3 = new Book("После балла", "Л.Н.Толстой");
        Book b4 = new Book("Детство. Отрочество. Юность.", "Л.Н.Толстой");

        Library library = new Library();

        LibraryCard lc1 = new LibraryCard(1, stu1);
        Calendar dateOfIssue = new GregorianCalendar(2023,8,14);
        //Journal record1 = new Journal(b1, lc1, dateOfIssue,7);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);

        System.out.println(library.bookToString());
        System.out.println(library.jornalToString());
    }
}
