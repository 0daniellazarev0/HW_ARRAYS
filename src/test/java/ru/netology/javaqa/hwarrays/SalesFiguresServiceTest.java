package ru.netology.javaqa.hwarrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesFiguresServiceTest {
    @Test
    public void shouldGetAnnualSales() {
        SalesFiguresService service = new SalesFiguresService();
        long[] salesFigures = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.getAnnualSales(salesFigures);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldGetAverageMonthlySales() {
        SalesFiguresService service = new SalesFiguresService();
        long[] salesFigures = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverage = 15;
        long actualAverage = service.averageMonthlyFigures(salesFigures);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldGetMonthWithLowestSales() {
        SalesFiguresService service = new SalesFiguresService();
        long[] salesFigures = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(salesFigures);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldGetMonthWithHighestSales() {
        SalesFiguresService service = new SalesFiguresService();
        long[] salesFigures = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(salesFigures);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldGetNumberOfMonthsWithBelowAverageSales() {
        SalesFiguresService service = new SalesFiguresService();
        long[] salesFigures = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int excpetedNOBAMs = 5;
        int actualNOBAMs = service.monthsBelowAverage(salesFigures);

        Assertions.assertEquals(excpetedNOBAMs, actualNOBAMs);
    }

    @Test
    public void shouldGetNumberOfMonthsWithAboveAverageSales() {
        SalesFiguresService service = new SalesFiguresService();
        long[] salesFigures = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNOAAMs = 5;
        int actualNOAAMs = service.monthsAboveAverage(salesFigures);

        Assertions.assertEquals(expectedNOAAMs, actualNOAAMs);
    }
}
