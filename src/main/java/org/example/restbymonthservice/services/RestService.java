package org.example.restbymonthservice.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 0; month < 12; month++) {
            if (money < threshold) {
                money = money + income - expenses;
            } else {
                count++;
                money = (money - expenses) / 3;
            }
        }
        return count;
    }

}
