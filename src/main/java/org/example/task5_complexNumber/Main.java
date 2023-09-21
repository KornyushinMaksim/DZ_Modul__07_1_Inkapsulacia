//      Разработать программу для представления комплексных чисел
//        с возможностью задания вещественной и мнимой частей,
//        как числами типов double, так и целыми числами.
//        Обеспечить выполнение операций:
//        ■ сравнения чисел;
//        ■ сложения;
//        ■ вычитания;
//        ■ умножения.
//        Протестировать с использованием JUnit.

package org.example.task5_complexNumber;

public class Main {
    public static void main(String[] args) {
        ComplexNumber number = new ComplexNumber(24, 8);
        ComplexNumber number1 = new ComplexNumber(2, 4);
        ComplexNumber number2 = number.summ(number1);
        ComplexNumber number3 = number.difference(number1);
        ComplexNumber number4 = number.multiplication(number1);
        ComplexNumber number5 = number.comparison(number1);
        System.out.println("Сумма: " + number2.myToString());
        System.out.println("Разность: " + number3.myToString());
        System.out.println("Умножение: " + number4.myToString());
        System.out.println("Сравнение: " + number5.myToString());
    }
}
