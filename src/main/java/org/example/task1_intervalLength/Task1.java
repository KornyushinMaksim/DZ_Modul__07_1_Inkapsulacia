package org.example.task1_intervalLength;

public class Task1 {
    protected String strIn;
    protected String[] strInArr;
    private String strOut;

    public Task1() {
        this.strIn = new String("Not information");
        strOut = new String();
    }

    public void setStrIn(String strIn) {
        this.strIn = strIn;
        splitStr(strInArr);
        testStr();
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

//    public String intersection(int indexOne, int indexTwo) {
//        int aOne = Integer.valueOf(strInArr[indexOne].substring(0, 1));
//        int bOne = Integer.valueOf(strInArr[indexOne].substring(2, strInArr[indexOne].length()));
//        int aTwo = Integer.valueOf(strInArr[indexTwo].substring(0, 1));
//        int bTwo = Integer.valueOf(strInArr[indexTwo].substring(2, strInArr[indexTwo].length()));
//
//
//        if ((aOne > aTwo && aOne < bTwo) || (bOne > aTwo && bOne < bTwo)) {
//            return "Эти диапазоны пересекатся";
//        } else {
//            return "Диапазоны не пересеклись";
//        }
//    }

    @Override
    public String toString() {
        return strOut;
    }

}
