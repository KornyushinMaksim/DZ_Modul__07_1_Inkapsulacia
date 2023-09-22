package org.example.task1_intervalLength;

public class Task1 {
    protected String strIn;
    protected String[] strInArr;
    private String strOut;

    public Task1() {
        this.strIn = new String("Not information");
        strOut = new String();
    }

    public String setStrIn(String strIn) {
        this.strIn = strIn;
        splitStr(strInArr);
        testStr();
        return strOut;
    }

    private void splitStr(String[] strArr) {
        this.strInArr = this.strIn.split(",");
    }

    private void testStr() {
        for (int i = 0; i < strInArr.length; i++) {
            strInArr[i] = strInArr[i].trim();
            int res = 0;
            int a = Integer.valueOf(strInArr[i].substring(0, strInArr[i].indexOf(" ")));
            int b = Integer.valueOf(strInArr[i].substring(strInArr[i].indexOf(" ") + 1, strInArr[i].length()));
            if (a > b) {
                strOut += "Некорректные данные, ";
            } else {
                res = b - a;
                strOut += String.valueOf(res) + ", ";
            }
        }
    }
    
    @Override
    public String toString() {
        return strOut;
    }

}
