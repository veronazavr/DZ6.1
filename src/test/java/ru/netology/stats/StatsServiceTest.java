package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldCalculateTest() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        for (int item : purchases) {
            System.out.println(item);
        }
    }

    @Test
    void shouldCalculateSum() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.calculateSum(purchases);
        int expected = 180;
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateMiddle() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.calculateMiddle(purchases);
        int expected = 15;
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateMaxMonth() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.calculateMaxMonth(purchases);
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateMinMonth() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.calculateMinMonth(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNumberOfMinMonth() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.calculateNumberOfMinMonth(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfMaxMonth() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.calculateNumberOfMaxMonth(purchases);
        int expected = 7;
        assertEquals(expected, actual);
    }
}







//    class StatsServiceTest {
//        @Test
//        void souldCalculateTest() {
//            int[] forchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//int sum = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
//}