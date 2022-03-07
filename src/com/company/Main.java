package com.company;

public class Main {

    public static void main(String[] args) {
        sum1();     //Задача №1 - проверка результата:
        sum2();     //Задача №2 - проверка результата:
        sum3();     //Задача №3 - проверка результата:
        sum4();     //Задача №4 - проверка результата:
        sum5();     //Задача №5 - проверка результата:
    }

    //Задача №1:
    private static void sum1() {
        int clientOS = 1;                             //0 — iOS, 1 — Android
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("К сожалению для вашей ОС существует только web версия сервиса");
        }
    }

    //Задача №2:
    private static void sum2() {
        int clientOS = 1;                             //0 — iOS, 1 — Android
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("К сожалению для вашей ОС существует только web версия сервиса");
        }
    }

    //Задача №3:
    private static void sum3() {
        int year = 2021;
        boolean leaYear = year % 4 == 0 && year % 100 > 0 || year % 400 == 0;
        if (leaYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //Задача №4:
    private static void sum4() {
        double deliveryDistance = 95;
        int distanceCount = 40;             // 20 - 1 день, далее от x до y, от x+40 до y+40 и т.д.
        double deliveryTime = Math.ceil((deliveryDistance - 19) / distanceCount);
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else {
            System.out.printf("Потребуется дней: %.0f\n", (deliveryTime + 1));
        }
    }

    //Задача №5:
    private static void sum5() {
        int monthNumber = 7;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Введены некорректные данные");
        }
    }
}
