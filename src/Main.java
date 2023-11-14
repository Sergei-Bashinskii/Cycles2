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

    public static void task1(){
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int month = 1;
        while (total <= 2_459_000){
            total = total + total/100;
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
            month++;
        }
    }

    public static void task2(){
        System.out.println("Задача 2");
        int x = 1;
        while (x <= 10){
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
    }

    public static void task3(){
        System.out.println("Задача 3");
        int allPeople = 12_000_000;
        int bornPeople = 17;
        int deadPeople = 8;
        int populationGrowth = bornPeople - deadPeople;
        for (int i = 1; i <= 10; i++){
            allPeople = allPeople + (allPeople / 1000 * populationGrowth);
            System.out.println("Год " + i + ", численность населения составляет " + allPeople);
        }
    }

    public static void task4(){
        System.out.println("Задача 4");
        int deposit = 15000;
        int total = 0;
        int month = 1;
        while (total <= 12_000_000){
            total = total + (total / 100 * 7);
            total = total + deposit;
            System.out.println("В " + month + " месяце, сумма накоплений составит: " + total + " рублей.");
            month++;
        }
    }

    public static void  task5(){
        System.out.println("Задача 5");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total <= 12_000_000){
            total = total + (total / 100 * 7);
            total = total + deposit;
            month++;
            if (month % 6 == 0){
                System.out.println("В " + month + " месяце, сумма накоплений составит: " + total + " рублей.");
            }
        }
    }

    public static void task6(){
        System.out.println("Задача 6");
        int deposit = 15000;
        int total = 0;
        for (int i = 1; i <= 108; i++){
            total = total + (total / 100 * 7);
            total = total + deposit;
            if (i % 6 == 0){
                System.out.println("В " + i + " месяце, сумма накоплений составит: " + total + " рублей.");
            }
        }
    }

    public static void task7(){
        System.out.println("Задача 7");
        int firstFriday = 4;
        for (int i = firstFriday; i <= 31;){
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            i = i + 7;
        }
    }

    public static void task8(){
        System.out.println("Задача 8");
        int nowYear = 2017;
        int yearsAgo = nowYear - 200;
        int nextYear = nowYear + 100;
        for (int i = 0; i < nextYear; i = i + 79){
            if (i > yearsAgo){
                System.out.println(i);
            }
        }
    }
}