package ru.netology.javaqa.hwarrays;

import java.util.Arrays;

public class SalesFiguresService {
    public long getAnnualSales(long[] monthlyFigures) {
        long annualSales = Arrays.stream(monthlyFigures).sum();

        return annualSales;
    }

    public long averageMonthlyFigures(long[] monthlyFigures) {
        long averageMonthlySales = (Arrays.stream(monthlyFigures).sum()) / (monthlyFigures.length);

        return averageMonthlySales;
    }

    public int minSales(long[] monthlyFigures) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < monthlyFigures.length; i++) {
            if (monthlyFigures[i] <= monthlyFigures[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] monthlyFigures) {
        int maxMonth = 0;
        for (int i = 0; i < monthlyFigures.length; i++) {
            if (monthlyFigures[i] >= monthlyFigures[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthsBelowAverage(long[] monthlyFigures) {
        long averageMonthlySales = (Arrays.stream(monthlyFigures).sum()) / (monthlyFigures.length);
        int numberOfMonthsBelowAverage = 0;
        for (long monthlyFigure : monthlyFigures) {
            if (monthlyFigure < averageMonthlySales) {
                numberOfMonthsBelowAverage++;
            }
        }
        return numberOfMonthsBelowAverage;
    }

    public int monthsAboveAverage(long[] monthlyFigures) {
        long averageMonthlySales = (Arrays.stream(monthlyFigures).sum()) / (monthlyFigures.length);
        int numberOfMonthsAboveAverage = 0;
        for (long monthlyFigure : monthlyFigures) {
            if (monthlyFigure > averageMonthlySales) {
                numberOfMonthsAboveAverage++;
            }
        }
        return numberOfMonthsAboveAverage;
    }
}
