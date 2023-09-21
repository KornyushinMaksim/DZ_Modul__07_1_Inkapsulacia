package org.example.task3_money;
import javax.swing.JOptionPane;

public class Massage {
    public static void error(){
        String title = "Massage";
        String text = "Введены недопустимые значения!";
        JOptionPane.showMessageDialog(null,text, title, JOptionPane.WARNING_MESSAGE);
    }

    public static void noMoney(){
        String title = "Massage";
        String text = "Деньги по нулям!";
        JOptionPane.showMessageDialog(null, text);
    }

    public static void minusMoney(){
        String title = "Massage";
        String text = "Вы должны нам денег!!!";
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void divOnNull(){
        String title = "Massage";
        String text = "Опять делишь на ноль!!!";
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
