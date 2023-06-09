package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcSalaryTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/salary")
    public void calculate(int income, int expenses, int threshold) {
        CalcSalary service = new CalcSalary();
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }


}
