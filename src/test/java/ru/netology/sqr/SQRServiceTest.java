package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void rootNumber() {
        SQRService service = new SQRService();
        int number1 = 200;
        int number2 = 300;
        int expected = 3;

        int actual = service.rootNumber(number1,number2);
        assertEquals(expected,actual);


    }
}