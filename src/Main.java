public class Main {
    public static void main(String[] args) {
        // задание 1
        System.out.println("Задание 1");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // задание 2
        System.out.println("Задание 2");
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // задание 3
        System.out.println("Задание 3");
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // задание 4
        System.out.println("Задание 4");
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        // задание 5
        System.out.println("Задание 5");
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        // задание 6
        System.out.println("Задание 6");
        var firstBoxerWeight=78.2;
        var secondBoxerWeight=82.7;
        var totalBoxerWeight=firstBoxerWeight+secondBoxerWeight;
        System.out.println("Вес первого боксёра: "+firstBoxerWeight+" кг");
        System.out.println("Вес второго боксёра: "+secondBoxerWeight+" кг");
        System.out.println("Общий вес двух боксёров: "+totalBoxerWeight+" кг");
        var differenceBoxersWeigh=secondBoxerWeight-firstBoxerWeight;
        System.out.println("Разница в весе между двумя боксёрами: "+differenceBoxersWeigh+" кг");
        // задание 7
        System.out.println("Задание 7");
        var variantOneDifferenceBoxersWeigh=secondBoxerWeight-firstBoxerWeight;
        var variantTwoDifferenceBoxersWeigh=secondBoxerWeight%firstBoxerWeight;
        System.out.println("Разница в весе между двумя боксёрами, вычисленная вычитанием: "+variantOneDifferenceBoxersWeigh+" кг");
        System.out.println("Разница в весе между двумя боксёрами, вычисленная остатком от деления: "+variantTwoDifferenceBoxersWeigh+" кг");
        // задание 8 часть 1
        System.out.println("Задание 8 часть 1");
        var totalWorkTime=640;
        var workTimeOnePerson=8;
        var totalPersonInCompany=totalWorkTime/workTimeOnePerson;
        System.out.println("Всего работников в компании – "+totalPersonInCompany+" человек");
        // задание 8 часть 2
        System.out.println("Задание 8 часть 2");
        totalPersonInCompany=totalPersonInCompany+94;
        totalWorkTime=totalPersonInCompany*workTimeOnePerson;
        System.out.println("Если в компании работает "+totalPersonInCompany+" человек, то всего "+totalWorkTime+" часов работы может быть поделено между сотрудниками");





    }
}

