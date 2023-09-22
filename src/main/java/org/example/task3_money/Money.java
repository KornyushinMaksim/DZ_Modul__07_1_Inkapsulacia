package org.example.task3_money;

import com.sun.javafx.binding.StringFormatter;

import java.text.DecimalFormat;

public class Money {
    private long rub;
    private byte kop;
    private boolean flag;

    public Money() {
        this.rub = 0;
        this.kop = 0;
        this.flag = true;
    }

    public Money(long rub, byte kop) {
        if (kop >= 0 && kop < 100) {
            this.rub = rub;
            this.kop = kop;
            this.flag = true;
        } else {
            Massage.error();
        }
    }

    public long getRub() {
        return rub;
    }

    public byte getKop() {
        return kop;
    }

    public void setRub(long rub) {
        this.rub = rub;
    }

    public void setKop(byte kop) {
        if (kop >= 0 && kop < 100) {
            this.kop = kop;
        } else {
            Massage.error();
        }
    }

    public Money summ(Money obj) {          //сложение сумм
        Money res = new Money();
        res.rub = this.rub + obj.rub;
        byte a = 100;
        byte summKop = (byte) (this.kop + obj.kop);
        if (summKop > a) {
            res.kop = (byte) (summKop - a);
            res.rub += 1;
            flag = true;
        } else {
            res.kop = summKop;
        }
        return res;
    }

    public Money difference(Money obj) {        //умножение на сумму
        Money res = new Money();
        res.rub = this.rub - obj.rub;
        if (this.kop < obj.kop) {
            if (res.rub > 0) {
                res.kop = (byte) (100 - (obj.kop - this.kop));
                res.rub--;
            } else if (res.rub < 0) {
                res.kop = (byte) (obj.kop - this.kop);
            } else if (res.rub == 0) {
                res.kop = (byte) (obj.kop - this.kop);
                res.flag = false;
            }
        } else {
            res.kop = (byte) (this.kop - obj.kop);
        }

        if (res.rub <= 0 && res.kop < 0) {
            Massage.minusMoney();
        }
        if (res.rub == 0 && res.kop == 0) {
            Massage.noMoney();
        }
        return res;
    }

    public double division(Money obj) {              //деление сумм
        double kopThis = this.rub * 100 + this.kop;
        double kopObj = obj.rub * 100 + obj.kop;
        double res = kopThis / kopObj;
        return res;
    }

    public Money differenceOnNumber(double value){//умножение дробного числа на сумму
        DecimalFormat formatDouble = new DecimalFormat("#0,00");
        Money res = new Money();
        double resRub = this.rub * value;
        formatDouble.format(resRub);
        res.rub = (long) resRub;
        double resKop = this.kop * value;
        double a = (resRub * 100) % 100;
        resKop += a;
        formatDouble.format(resKop);
        if (resKop > 99){
            res.rub += (long) resKop / 100;
            res.kop = (byte) (resKop % 100);
        }
        res.kop = (byte) resKop;
        return res;
    }

                //деление суммы на дробное число
    public Money divisionOnNumber(double value){
        Money newMoney = new Money();
        newMoney.rub = (long) (this.rub / value);
        newMoney.kop = (byte) (this.kop / value);
        return newMoney;
    }

    @Override
    public String toString() {
        if (this.flag) {
            return this.rub + "руб. " + this.kop + "коп.";
        } else {
            return "-" + this.rub + "руб. " + this.kop + "коп.";
        }
    }
}
