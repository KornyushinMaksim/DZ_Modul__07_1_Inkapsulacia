package org.example.task5_complexNumber;

public class ComplexNumber {
    private double rezD;
    private double imzD;

    public ComplexNumber() {
    }

    public ComplexNumber(int rezInt, int imzInt) {
        this.rezD = rezInt;
        this.imzD = imzInt;
    }

    public ComplexNumber(double rezD, double imzD) {
        this.rezD = rezD;
        this.imzD = imzD;
    }

    public ComplexNumber summ(ComplexNumber obj){
        ComplexNumber res = new ComplexNumber();
        res.rezD = this.rezD + obj.rezD;
        res.imzD = this.imzD + obj.imzD;
        return res;
    }

    public ComplexNumber difference(ComplexNumber obj){
        ComplexNumber res = new ComplexNumber();
        res.rezD = this.rezD - obj.rezD;
        res.imzD = this.imzD - obj.imzD;
        return res;
    }

    public ComplexNumber multiplication(ComplexNumber obj){
        ComplexNumber res = new ComplexNumber();
        res.rezD = (this.rezD * obj.rezD - this.imzD * obj.imzD);
        res.imzD = (this.rezD * obj.imzD + this.imzD * obj.rezD);
        return res;
    }

    public ComplexNumber comparison(ComplexNumber obj){
        boolean flag = true;
        if (this.rezD > obj.rezD){
            flag = true;
        } else if (this.rezD < obj.rezD) {
            flag = false;
        } else if (this.rezD == obj.rezD){
            if (this.imzD > obj.imzD) {
                flag = true;
            } else if (this.imzD < obj.imzD){
                flag = false;
            }
        }
        if (flag){
            return this;
        } else {
            return obj;
        }
    }

    public StringBuilder myToString(){
        StringBuilder str = new StringBuilder("\n" + rezD + " + " + imzD + "i");
        return str;
    }
}
