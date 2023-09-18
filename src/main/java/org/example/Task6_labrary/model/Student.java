package org.example.Task6_labrary.model;

import java.util.ArrayList;

public class Student {
    private String surname;
    private String name;
    private String groupID;
    private ArrayList<Student> students;

    public Student() {
        this.surname = null;
        this.name = null;
        this.groupID = null;
    }

    public Student(String surname, String name, String groupID) {
        this.surname = surname;
        this.name = name;
        this.groupID = groupID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
            //доработать
//    public void addStudent(String name, String surname, String groupID){
//        Student newStudent = new Student(name, surname, groupID);
//        students.add(newStudent);
//    }

    @Override
    public String toString() {
        return "\nStudent {" +
                "\nФамилия: " + surname +
                ", \nИмя: " + name +
                ", \nНомер группы: " + groupID +
                '}';
    }
}
