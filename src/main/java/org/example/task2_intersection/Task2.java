package org.example.task2_intersection;

import org.example.task1_intervalLength.Task1;

public class Task2 extends Task1 {
    private int indexOne;
    private int indexTwo;
    private String strInfo;
    public Task2() {
        super();
        this.indexOne = 0;
        this.indexTwo = 1;
        this.strInfo = new String();
    }

    public void setIndexOne(int indexOne) {
        if (this.indexOne > 0 && this.indexOne < this.strInArr.length) {
            this.indexOne = indexOne;
        } else {
            info();
        }
    }

    public void setIndexTwo(int indexTwo) {
        if (indexTwo > 0 && indexTwo < this.strInArr.length) {
            this.indexTwo = indexTwo;
        } else {
            info();
        }
    }

    private String info (){
        this.strInfo = "Данные е корректны";
        return strInfo;
    }

    public String intersection(int indexOne, int indexTwo) {
        int aOne = Integer.valueOf(strInArr[indexOne].substring(0, strInArr[indexOne].indexOf(" ")));
        int bOne = Integer.valueOf(strInArr[indexOne].substring(strInArr[indexOne].indexOf(" ") + 1,
                strInArr[indexOne].length()));
        int aTwo = Integer.valueOf(strInArr[indexTwo].substring(0, strInArr[indexTwo].indexOf(" ")));
        int bTwo = Integer.valueOf(strInArr[indexTwo].substring(strInArr[indexTwo].indexOf(" ") + 1,
                strInArr[indexTwo].length()));

        if ((aOne > aTwo && aOne < bTwo) || (bOne > aTwo && bOne < bTwo)) {
            return "Эти диапазоны пересекаются";
        } else {
            return "Диапазоны не пересеклись";
        }
    }
}
