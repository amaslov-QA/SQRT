package ru.netology.sqr;

public class SQRService<counter> {
    public int rootNumber(int loverValue, int endValue) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= loverValue && i * i <= endValue) {
                counter = i++;
            }

        }

        return counter;

    }
}

