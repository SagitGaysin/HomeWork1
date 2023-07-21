public class Main {
    public static void main(String[] args) {
        System.out.println("Задача_1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("Задача_2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("Задача_3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("Задача_4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();

        System.out.println("Задача_5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        System.out.println("Задача_6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес двух боксеров = " + totalWeight + " кг");
        System.out.println("Общий вес двух боксеров = " + totalWeight + " кг");
        System.out.println();

        System.out.println("Задача_7");
        var method1 = weightBoxer2 - weightBoxer1;
        System.out.println("Разница весов спортсменов через вычитание от большего веса меньшее = " + method1 + " кг");
        var method2 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница весов спортсменов через функцию остатка от деления = " + method2 + " кг");
        System.out.println();

        System.out.println("Задача_8");
        var totalTime = 640;
        var employees = totalTime / 8;
        System.out.println("Всего работников в компании — " + employees + " человек");
        var moreEmployees = employees + 94;
        totalTime = moreEmployees * 8;
        System.out.println("Если в компании работает " + moreEmployees + " человек, то всего " + totalTime +" часов работы может быть поделено между сотрудниками");

    }
}