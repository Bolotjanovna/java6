package ru.netology.javaqa.java6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcSalaryTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/salary")
    public int calculate(int income, int expenses) {
        int count = 3;
        int money = 0;
        for (int month = 1; month < 12; month++) {
            if (money >= expenses) {
                count++;
                money = money - expenses;
            } else {
                money = money + income;
            }
        }
        return count;

    }
}
