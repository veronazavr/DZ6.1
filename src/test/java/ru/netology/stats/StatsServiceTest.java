package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
void CountAmountOfPurchases() {
    StatsService service = new StatsService();
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int actual = service.allAmount(purchases);
    int expected = 180;
    assertEquals(expected, actual);
}

    @Test
    void CountAverageOfPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.amountAverage(purchases);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void monthMaxPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthMax(purchases);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void monthMinPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthMin(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void amountMinAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.amountMinAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void amountMaxAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.amountMaxAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

}






//    class StatsServiceTest {
//        @Test
//        void souldCalculateTest() {
//            int[] forchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//int sum = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
//}