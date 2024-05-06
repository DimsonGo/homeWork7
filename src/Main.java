public class Main {
    public static void main(String[] args) {
        System.out.println("Задание номер 1");
        var month = 1;
        var bank = 0;
        var deposit = 15_000;
        while (bank <= 2_459_000) {
            month++;
            bank = bank + bank / 100;
            bank += deposit;
            System.out.println("Месяц " + month + " сумма накоплений равна " + bank + " рублей");
        }
        System.out.println();
        System.out.println("Задание 2");
        int num = 0;
        while (num <= 9) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (; num > 0; num--) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birth = 17;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
            population = population + (birth - mortality) * population / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println();
        System.out.println("Задание 4");
        int byDeposits = 15_000;
        int monthMoney = 1;
        while (byDeposits < 12_000_000) {
            byDeposits = byDeposits + (int) (byDeposits * 0.07);
            System.out.println("Месяц " + monthMoney + ", сумма накоплений: " + byDeposits);
            monthMoney++;
        }

        System.out.println();
        System.out.println("Задание 5");
        int depositMoney = 15_000;
        int monthOne = 1;
        while (depositMoney <= 12_000_000) {
            depositMoney = depositMoney + (int) (depositMoney * 0.07);
            if (monthOne % 6 == 0) {
                System.out.println("Месяц " + monthOne + ", сумма накоплений равна: " + depositMoney);
            }
            monthOne++;

        }

        System.out.println();
        System.out.println("Задача 6");
        int totalSumma = 15_000;
        for (int monthT = 1; monthT <= 108; monthT++) {
            totalSumma = totalSumma + (int) (totalSumma * 0.07);
            if (monthT % 6 == 0) {
                System.out.println("Месяц " + monthT + ", сумма накоплений равна: " + totalSumma);
            }
        }

        System.out.println();
        System.out.println("Задание 7");
        int firstFriday = 6; // первая пятница месяца
        for ( int day = firstFriday; day <= 31; day += 7){
            System.out.println("Сегодня " + day + "-е число. Необходимо подготовить отчет");
        }

        System.out.println();
        System.out.println("Задание 8");
        int yearLast = 1824;
        int yearFuture = 2124;
        for (int year = yearLast; year <= 2124; year ++ ){
            if (year % 79 == 0){
                System.out.println(year);
            }
        }
    }
}