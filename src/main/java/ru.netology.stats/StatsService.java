package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    }
    public static int allAmount(int [] purchases){
        int amount = 0;
        for (int purchase:purchases) {
            amount += purchase;
        }
        return amount;
    }

    public static int amountAverage(int[] purchases) {
        return allAmount(purchases) / purchases.length;
    }

    public static int monthMax(int[] purchases) {
        int max = purchases[0];
        int number = 0;
        int numberMax = 0;
        for (int purchase : purchases) {
            number++;
            if (max <= purchase) {
                max = purchase;
                numberMax = number;
            }
        }
        return numberMax;
    }
    public static int monthMin(int[] purchases) {
        int min = purchases[0];
        int number = 0;
        int numberMin = 0;
        for (int purchase : purchases) {
            number++;
            if (min >= purchase) {
                min = purchase;
                numberMin = number;
            }
        }
        return numberMin;
    }
    public static int  amountMinAverage(int[] purchases) {
        int average = amountAverage(purchases);
        int month = 0;
        int amountMin = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                month++;
                amountMin = month;
            }
        }
        return amountMin;
    }
    public static int amountMaxAverage(int[] purchases) {
        int average = amountAverage(purchases);
        int month = 0;
        int amountMax = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                month++;
                amountMax = month;
            }
        }
        return amountMax;


    }

}