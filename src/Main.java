public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println("__________________________");
        task2();
        System.out.println("__________________________");
        task3();
        System.out.println("__________________________");
        task4();
        System.out.println("__________________________");
        task5();
        System.out.println("__________________________");
        task6();
        System.out.println("__________________________");
        task7();
        System.out.println("__________________________");
        task8();
    }

    public static int percentageCalculation(int amount, int percent) {
        return amount / 100 * percent;
    }

    public static void task1() {
        int money = 15000;
        int total = 0;
        int month = 1;
        while (total <= 2_459_000) {
            total += money;
            total += total / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
    }

    public static void task2() {
        int i = 1;
        int j = 10;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            int births = (population * birthRate) / 1000;
            int deaths = (population * deathRate) / 1000;
            population += (births - deaths);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        int money = 15000;
        int percent = 7;
        int goal = 12_000_000;
        int result = 0;
        int month = 0;
        do {
            result += money;
            result += percentageCalculation(money, percent);
            month++;
            System.out.println("Месяц " + month + ". Накоплено: " + result);
        } while (result <= goal);
    }

    public static void task5() {
        int money = 15000;
        int percent = 7;
        int goal = 12_000_000;
        int result = 0;
        int month = 0;
        do {
            result += money;
            result += percentageCalculation(money, percent);
            month++;
            if (month % 6 == 0 || result > goal) {
                System.out.println("Месяц " + month + ". Накоплено: " + result);
            }
        } while (result <= goal);
    }

    public static void task6() {
        int money = 15000;
        int percent = 7;
        int years = 9;
        int month1 = years * 12;
        int month = 0;
        int result = 0;
        do {
            result += money;
            result += percentageCalculation(money, percent);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ". Накоплено: " + result);
            }
        } while (month <= month1);
    }

    public static void task7() {
        int friday = 2;
        byte days = 31;
        for (; friday <= days; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");

        }
    }

    public static void task8() {
        int emergencePeriod = 79;
        int currentYear = 2024;
        int lastYears = currentYear - 200;
        int nextYears = currentYear + 100;
        for (int i = 0; i <= nextYears; i += emergencePeriod) {
            if (i > lastYears && i < nextYears) {
                System.out.println(i);
            }
        }

    }
}
