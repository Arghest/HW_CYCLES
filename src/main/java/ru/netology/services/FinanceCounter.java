package ru.netology.services;

public class FinanceCounter {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // отдых
                money = money - expenses;
                money = money / 3;
                count++; // увеличиваем счётчик месяцев отдыха
            } else { //работа
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}
