package org.example.task6_library.model;

public class Student {
    private String name;
    private String surname;
    private String groupID;
    private LibraryCard card;

    public Student() {

    }

    public Student(String name, String surname, String groupID) {
        this.name = name;
        this.surname = surname;
        this.groupID = groupID;
        this.card = null;
    }

    public void setCard(LibraryCard card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroupID() {
        return groupID;
    }

    public LibraryCard getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\nИмя: " + name +
                "\nФамилия: " + surname +
                "\n№ группы: " + groupID +
//                "\nЧитБилет: " + card +
                '}';
    }
}
