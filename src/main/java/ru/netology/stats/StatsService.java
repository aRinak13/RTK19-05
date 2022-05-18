package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
         sum += sale;
        }
        return sum;
    }

    public int findAvg (int[] sales) {
        return calcSum(sales) / sales.length;
    }


    public int monthMaxSales (int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthMinSales (int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numMonthBelowAvg (int[] sales) {
        int saleAvg = findAvg(sales);
        int month = 0;
        for (int monthNum : sales) {
            if (monthNum < saleAvg) {
              month = month + 1;
            }
        }
        return month;
    }

    public int numMonthAboveAvg (int[] sales) {
        int saleAvg = findAvg(sales);
        int month = 0;
        for (int monthNum : sales) {
            if (monthNum > saleAvg) {
                month = month + 1;
            }
        }
        return month;
    }
}


