package org.example.task6_library.model;

public class WorkLibrary {

    public void start(){
        Student stu1 = new Student("Леван", "Джитаридзе", "ГО-22");
        Student stu2 = new Student("Иван", "Бутько", "С-11");

        Book b1 = new Book("Мартин Иден", "Д.Лондон");
        Book b2 = new Book("Война и мир", "Л.Н.Толстой");
        Book b3 = new Book("Прощай, оружие", "Э.Хемингуэй");

        Library library = new Library();
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("Библиотека до получения\n" + library);

        library.issuanceBook("Война и мир", "Л.Н.Толстой", stu1);

        System.out.println("Библиотека после получения\n" + library);

        library.returnBook(b2, stu1);

        System.out.println("Библиотека после возврата\n" + library);

        library.issuanceBook("Мартин Иден", "Д.Лондон", stu2);

        System.out.println("Библиотека после получения\n" + library);

        library.returnBook(b1, stu2);

        System.out.println("Библиотека после возврата\n" + library);
    }
}
