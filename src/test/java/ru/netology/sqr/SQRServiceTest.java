package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'InRange', 200, 300, 3",
            "'MinResult', 100, 100, 1",
            "'MaxResult', 100, 9801, 90" })
    void sqNumber(String test, int min, int max, int expected) {
        SQRService service = new SQRService();
        int quantity = service.sqNumber(min, max);
        assertEquals(expected, quantity);
    }
}
