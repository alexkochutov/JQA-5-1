package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    public void shouldReturnCount(int lowerBoundary, int upperBoundary, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(lowerBoundary, upperBoundary);
        Assertions.assertEquals(expected, actual);
    }

}