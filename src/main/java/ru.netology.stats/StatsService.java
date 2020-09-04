package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    public int calculateMiddle(int[] array) {
        int middle = 0;
        int sum = 0;
        for (int purchases : array) {
            sum += purchases;
        }
        middle = sum / 12;
        return middle;
    }

    public int calculateMaxMonth(int[] array) {
        int max = 0;
        int count = 0;
        int maxMonth = 0;
        for (int purchases : array) {
            count +=1;
            if (max<=purchases) {
              max=purchases;
              maxMonth = count;
          }
        }
        return maxMonth;
    }
    public int calculateMinMonth(int[] array) {
        int min = array[0];
        int count = 0;
        int minMonth = 0;
        for (int purchases : array) {
            count +=1;
            if (min>purchases) {
                min=purchases;
                minMonth = count;

            }
        }
        return minMonth;
    }

    public int calculateNumberOfMinMonth(int[] array) {
        int middle = 0;
        int sum = 0;
        int numberOfMinMonth=0;
        for (int purchases : array) {
            sum += purchases;
        }
        middle = sum / 12;
        for (int purchases : array){
            if (middle>purchases){
                numberOfMinMonth +=1;
            }
        }
        return numberOfMinMonth;
    }

    public int calculateNumberOfMaxMonth(int[] array) {
        int middle = 0;
        int sum = 0;
        int numberOfMaxMonth=0;
        for (int purchases : array) {
            sum += purchases;
        }
        middle = sum / 12;
        for (int purchases : array){
            if (middle<=purchases){
                numberOfMaxMonth +=1;
            }
        }
        return numberOfMaxMonth;
    }
}
