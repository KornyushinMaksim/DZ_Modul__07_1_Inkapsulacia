package org.example.task3_money;

public class Money {
    private long rub;
    private byte kop;
    boolean flag;

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

    public Money division(Money obj){
        Money res = new Money();
        float k = 60 / 100;
        double div = (obj.rub + (obj.kop / 100));
        double resRub = this.rub / div;
        double resKop = this.kop / div;
        return res;
    }

//    public Money division(Money obj) {              //деление сумм
//        Money res = new Money();
//        double scale = Math.pow(10, 2);
//        long kopThis = this.rub * 100 + this.kop;
//        long kopObj = obj.rub * 100 + obj.kop;
//        if (kopObj == 0) {
//            Massage.divOnNull();
//        } else {
//            double div = kopThis / kopObj;
//            res.rub = (long) div;
//            res.kop = (byte) (Math.ceil(div * scale) / scale);
//        }
//        return res;
//    }

    public Money differenceOnNumber(float value){            //умножение дробного числа на сумму
        Money res = new Money();
        float resRub = this.rub * value;
        res.rub = (int) resRub;

        return res;
    }

                //деление суммы на дробное число

    @Override
    public String toString() {
        if (this.flag) {
            return this.rub + "руб. " + this.kop + "коп.";
        } else {
            return "-" + this.rub + "руб. " + this.kop + "коп.";
        }
    }
}
