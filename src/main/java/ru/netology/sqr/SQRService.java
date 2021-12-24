package ru.netology.sqr;

public class SQRService {
    public int sqNumber(int min, int max) {
        int quantity = 0;
        for (int i = 10; i < 100; i++) {
            int sqNumber = i * i;
            if (sqNumber >= min && sqNumber <= max) {
                quantity++;
            }
        }
        return quantity;

    }
}

