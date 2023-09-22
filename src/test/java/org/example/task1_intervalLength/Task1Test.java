package org.example.task1_intervalLength;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void setStrIn() {
        Task1 task1 = new Task1();
        String str = "2 5";
        task1.setStrIn(str);
        String s = "3, ";
        String s1 = task1.toString();
        Assertions.assertArrayEquals(s.toCharArray(), s1.toCharArray());
    }
}