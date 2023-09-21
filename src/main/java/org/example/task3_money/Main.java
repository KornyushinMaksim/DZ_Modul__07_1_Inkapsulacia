//      Создать класс Money (Деньги) для работы с денежными суммами. Число должно быть представлено двумя полями:
//        ■ типа long – для гривен;
//        ■ типа byte – для копеек.
//        Реализовать вывод значения на экран, при этом дробная
//        часть должна быть отделена от целой части запятой. Реализовать сложение, вычитание, деление сумм,
//        деление суммы на дробное число, умножение на дробное число и операции сравнения.
//        Протестировать с использованием JUnit.

package org.example.task3_money;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество рублей и копеек");
        long rub = in.nextLong();
        byte kop = in.nextByte();
        float number = 2.30f;

        Money money = new Money(rub, kop);
        Money money1 = new Money(10L, (byte) 20);
        Money money2 = money.summ(money1);
        Money money3 = money.difference(money1);
        Money money4 = money.division(money1);
        Money money5 = money.differenceOnNumber(number);
        System.out.println(money);
        System.out.println(money1);
        System.out.println("сложение " + money2);
        System.out.println("вычитание " + money3);
        System.out.println("деление " + money4);
        System.out.println("умн на чис " + money5);

    }
}
