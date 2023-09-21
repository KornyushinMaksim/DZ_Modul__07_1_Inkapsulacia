//      Создать программу, которая позволяет ввести с клавиатуры n диапазонов
//        целочисленных значений (например, 3-10). Каждый диапазон имеет начальную и конечную точку.
//        После ввода программа должна вывести длину каждого диапазона.
//        Программа должна выводить сообщение об ошибке, если начало диапазона больше, чем конец.
//        Протестировать с использованием JUnit.
//        Пример:
//        Входные данные: 3 9, -2 4, 11 15
//        Выходные 3, 6, 4

package org.example.task1_intervalLength;

import org.example.task2_intersection.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите диапазоны с пробелом через запятую (пр: 3 8, 4 9 и т.д.)");
        String strIn = in.nextLine();

        Task2 obj = new Task2();
        obj.setStrIn(strIn);
        System.out.println(obj);

        //вторая задача
        System.out.println("Введите номера диапазонов");
        int indexOne = in.nextInt();
        int indexTwo = in.nextInt();
        System.out.println(obj.intersection(indexOne, indexTwo));
    }
}
