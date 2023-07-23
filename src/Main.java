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
        byte a = 5;
        short b = 1022;
        int c = 2569726;
        long d = -1259448534;
        float e = 10.55f;
        double f = 58.15d;

        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        float variableOne = 27.12f;
        long variableTwo = 987678965549L;
        double variableThree = 2.786d;
        short variableFour = 569;
        short variableFive = -159;
        short variableSix = 27897;
        byte variableSeven = 67;

        System.out.println("Значение переменной variableOne с типом float равно " + variableOne);
        System.out.println("Значение переменной variableTwo с типом long равно " + variableTwo);
        System.out.println("Значение переменной variableThree с типом double равно " + variableThree);
        System.out.println("Значение переменной variableFour с типом short равно " + variableFour);
        System.out.println("Значение переменной variableFive с типом short равно " + variableFive);
        System.out.println("Значение переменной variableSix с типом short равно " + variableSix);
        System.out.println("Значение переменной variableSeven с типом byte равно " + variableSeven);
        System.out.println();

    }

    public static void task3() {
        System.out.println("Задача 3");
        byte studentsLydPav = 23;
        byte studentsAnSerg = 27;
        byte studentsEkatAndr = 30;
        short papers = 480;
        int totalStudents = studentsAnSerg + studentsEkatAndr + studentsLydPav;
        int studentsPaper = papers / totalStudents;

        System.out.println("На каждого ученика рассчитано " + studentsPaper + " листов бумаги");
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");

        byte productivityOneMinute = 16 / 2;
        int productivityTwentyMinute = productivityOneMinute * 20;
        int productivityOneDay = productivityOneMinute * (24 * 60);
        int productivityThreeDay = productivityOneDay * 3;
        int productivityOneMonth = productivityOneDay * 30;

        System.out.println("За 20 минут машина произвела " + productivityTwentyMinute + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityThreeDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + productivityOneMonth + " штук бутылок");
        System.out.println();
    }
    public static void  task5() {
        System.out.println("Задача 5");

        byte totalPaint = 120;
        byte whitePaintOneClass = 2;
        byte brownPaintOneClass = 4;
        int totalPainOneClass = whitePaintOneClass + brownPaintOneClass;
        int totalClasses = totalPaint / totalPainOneClass;
        int totalWhitePaint = whitePaintOneClass * totalClasses;
        int totalBrownPaint = brownPaintOneClass * totalClasses;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");

        short oneBananasWeight = 80;
        short milkWeight = 105; //вес  100 мл
        short iceCreamWeight = 100;
        short eggWeight = 70;
        int oneRecipe = (oneBananasWeight * 5) + (milkWeight * 2) + (iceCreamWeight * 2) + (eggWeight * 4);
        float breakfastOneRecipe = oneRecipe /1000f;

        System.out.println("Вес завтрака из: ");
        System.out.println(" - бананов - 5 шт");
        System.out.println(" - молока - 200 мл");
        System.out.println(" - мороженого-пломбира - 2 брикета");
        System.out.println(" - яиц сырых - 4 шт");
        System.out.println( "равно " + breakfastOneRecipe + " кг");
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        int totalKilogram = 7000;
        short oneDailyWeightLoss = 250;
        short twoDailyWeightLoss = 500;
        int oneDayWeightLoss = totalKilogram / oneDailyWeightLoss;
        int twoDayWeightLoss = totalKilogram / twoDailyWeightLoss;
        int averageDaysWeightLoss = (oneDayWeightLoss + twoDayWeightLoss) / 2;

        System.out.println("При потере веса 250 грамм в день, понадобится " + oneDayWeightLoss + " дней чтобы сбросить 7 кг");
        System.out.println("При потере веса 250 грамм в день, понадобится " + twoDayWeightLoss + " дней чтобы сбросить 7 кг");
        System.out.println("В среднем понадобится " + averageDaysWeightLoss + " дней, чтобы добиться результата похудения");
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");

        int salaryMashaInMonth = 67760;
        int salaryDenisInMonth = 83690;
        int salaryKristinaInMonth = 76230;
        double salaryMashaRaising = salaryMashaInMonth * 1.1d;
        double salaryDenisRaising = salaryDenisInMonth * 1.1d;
        double salaryKristinaRaising = salaryKristinaInMonth *1.1d;
        float incomeDifferenceMasha = (float) ((salaryMashaRaising * 12) - (salaryMashaInMonth * 12));
        float incomeDifferenceDenis = (float) ((salaryDenisRaising * 12) - (salaryDenisInMonth * 12));
        float incomeDifferenceKristina =(float) ((salaryKristinaRaising * 12) - (salaryKristinaInMonth * 12));


        System.out.println("Маша теперь получает " + salaryMashaRaising + " рублей в месяц. Годовой доход вырос на " + incomeDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisRaising + " рублей в месяц. Годовой доход вырос на " + incomeDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaRaising + " рублей в месяц. Годовой доход вырос на " + incomeDifferenceKristina + " рублей");
        System.out.println();
        }
}