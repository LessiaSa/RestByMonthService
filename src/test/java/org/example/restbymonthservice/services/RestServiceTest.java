
package org.example.restbymonthservice.services;
//import org.example.restbymonthservice.services.RestService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvSource({
            "100000,60000,150000,2",
            "10000,3000,20000,3",
            "5000,2000,10000,2",
            "500000,250000,1000000,2"
    })

    void restCalculateMonth(int income,int expenses,int threshold,int expected) {
        RestService service = new RestService();
        //int income = 100_000;
        //int expenses = 60_000;
        //int threshold = 150_000;
        //int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    /* @Test
    void restCalculateMonthOrdinary() {
        RestService service = new RestService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void restCalculateMonthPoor() {
        RestService service = new RestService();
        int income = 5_000;
        int expenses = 2_000;
        int threshold = 10_000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    void restCalculateMonthRich() {
        RestService service = new RestService();
        int income = 500_000;
        int expenses = 250_000;
        int threshold = 1_000_000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
    */
}
