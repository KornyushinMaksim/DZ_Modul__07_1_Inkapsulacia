package org.example.task3_money;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    Money money = new Money(10l, (byte) 20);
    Money money1 = new Money(5l, (byte) 10);
    double num = 2.50;
    @Test
    void summ() {
        Assertions.assertEquals(15l, money.summ(money1).getRub());
        Assertions.assertEquals((byte) 30, money.summ(money1).getKop());
    }

    @Test
    void difference() {
        Assertions.assertEquals(5l, money.difference(money1).getRub());
        Assertions.assertEquals((byte) 10, money.difference(money1).getKop());
    }

    @Test
    void division() {
        Assertions.assertEquals(2d, money.division(money1));
    }

    @Test
    void differenceOnNumber() {
        Assertions.assertEquals(25l, money.differenceOnNumber(num).getRub());
        Assertions.assertEquals((byte) 50, money.differenceOnNumber(num).getKop());
    }

    @Test
    void divisionOnNumber() {
        Assertions.assertEquals(4l, money.divisionOnNumber(num).getRub());
        Assertions.assertEquals((byte) 8, money.divisionOnNumber(num).getKop());
    }
}