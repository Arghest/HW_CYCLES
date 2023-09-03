package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinanceCounterTest {
    @Test
    public void Calculate1() {
        FinanceCounter service = new FinanceCounter();
        int actualres = service.calculate(10_000, 3_000, 20_000);
        int expectedres = 3;
        Assertions.assertEquals(expectedres, actualres);
    }
    @Test
    public void Calculate2() {
        FinanceCounter service = new FinanceCounter();
        int actualres = service.calculate(100_000, 60_000, 150_000);
        int expectedres = 2;
        Assertions.assertEquals(expectedres, actualres);
    }


}