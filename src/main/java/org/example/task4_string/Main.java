//      Описать базовый класс MainString (Строка). Обязательные поля класса:
//        ■ массив символов;
//        ■ значение типа int хранит длину строки в символах.
//        Реализовать обязательные методы следующего назначения:
//        ■ конструктор без параметров;
//        ■ конструктор, принимающий в качестве параметра стро-
//        ковый литерал;
//        ■ конструктор, принимающий в качестве параметра символ;
//        ■ метод получения длины строки;
//        ■ метод очистки строки (делает строку пустой);
//        ■ метод поиска символа в строке.

package org.example.task4_string;

public class Main {
    public static void main(String[] args) {
        myString string = new myString("asdfasdf");
        System.out.println("Исходная строка: " + string.myToString());
        System.out.println("Длинна строки: " + string.myLength());
        System.out.println("Индекс искомого символа: " + string.mySearch('d'));
        string.myClearStr();
        System.out.println("Пустая исходная строка: " + string.myToString());
    }
}
