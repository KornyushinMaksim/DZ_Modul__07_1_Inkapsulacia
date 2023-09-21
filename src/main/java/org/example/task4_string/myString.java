package org.example.task4_string;

public class myString {
    char[] string;
    int length;

    public myString(){
        this.length = 0;
        this.string = new char[this.length];
    }

    public myString(String str){
        this.string = str.toCharArray();
        for (char ch : this.string){
            this.length++;
        }
    }

    public myString(char symb){
        this.string = new char[]{symb};
        this.length = 1;
    }

    public int myLength(){
        return this.length;
    }

    public void myClearStr(){
        StringBuilder tmpStr = new StringBuilder();
        for (char ch: this.string){
            tmpStr.append(ch);
        }
        tmpStr.delete(0, this.length);
        this.string = tmpStr.toString().toCharArray();
    }

    public int mySearch(char symb){
        int index = 0;
        for (int i = 0; i < this.length; i++){
            if (this.string[i] == symb){
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public StringBuilder myToString() {
        StringBuilder str = new StringBuilder("'");
        for (char ch : this.string){
            str.append(ch);
        }
        str.append("'");
        return str;
    }
}
