package ru.netology.javaqa.BonusCalculatorAutotestCSV;

public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        if (amount < 0) {
            amount = 0;
            System.out.println("Введите корректную сумму");
        }
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;

    }
}