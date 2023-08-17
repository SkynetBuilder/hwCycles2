public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        //В условиях не совсем ясно, какое задание имеется в виду, работаю с данными, которые указаны
        short deposit = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total += deposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = (population / 1000) * 17;
        int mortalityRate = (population / 1000) * 8;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + birthRate - mortalityRate;
            birthRate = (population / 1000) * 17;
            mortalityRate = (population / 1000) * 8;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        float deposit = 15_000f;
        float total = 0;
        int month = 0;
        while (total <= 12_000_000f) {
            month++;
            total += deposit;
            total += total * 0.07f;
            System.out.printf("Месяц " + month + ", сумма накоплений равна %.2f", total, " рублей");
            //Округлил до 2 знаков после запятой
            System.out.println();
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        float deposit = 15_000f;
        float total = 0;
        int month = 0;
        while (total <= 12_000_000f) {
            month++;
            total += deposit;
            total += total * 0.07f;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + ", сумма накоплений равна %.2f", total, " рублей");
                System.out.println();
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        float deposit = 15_000f;
        float total = 0;
        int month = 0;
        while (month <= 9 * 12) {
            month++;
            total += deposit;
            total += total * 0.07f;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + ", сумма накоплений равна %.2f", total, " рублей");
                System.out.println();
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 4;
        for (int day = 1; day <= 31; day++) {
            if (day % 7 == firstFriday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 1823;
        while (year <= 2123) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
            year++;
        }
    }
}