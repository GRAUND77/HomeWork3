public class Main {
    public static void main(String[] args) {
        // Задача 1.


        byte ageOfTheDog = 127;
        // byte - хранит целое число от -128 до 127 и занимает 1 байт
        short houseWeight = 32000;
        // short - хранит целое число от -32768 до 32767 и занимает 2 байта
        int theMassOfThePlanetEarth = 2147483647;
        // int - хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        long volumeOfTheWorldOcean = 9_223_372_036_854_775_807L;
        //  long - хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт


        // Вещественные типы переменных (типы с плавающей точкой) - float,double

        float theNumberPi = 3.141592653589793238f;
        // float: хранит число с плавающей точкой от -3.4*10 в степени 38 до 3.4*10 в степени 38 и занимает 4 байта
        double n = 4.0000000009999999999999990;
        // double: хранит число с плавающей точкой от -1.7*10 в степени 308 до 1.7*10 в степени 308 и занимает 8 байт


        // Символьный тип переменных - char (создадание переменной в соответствии с таблицей символов ASCII)

        char c = 33;// 33 соответствует символу ! табл.ASCII
        char b = 34;// 34 соответствует символу " табл.ASCII
        System.out.println(b);

        //Логический тип переменных "boolean"— тип, в котором хранится информация в формате true/false (т. е. истина/ложь).

        int age = 18;
        boolean isAdult = age >= 18;
        System.out.println(isAdult);


        // Задача 2.

        var WeightOfOneBoxer = 79.5;
        var WeightOfTheSecondBoxer = 82.7;
        System.out.println("Общий вес двух боксеров " + (WeightOfOneBoxer + WeightOfTheSecondBoxer) + " кг");
        System.out.println("Разница между весами боксеров " + (WeightOfTheSecondBoxer - WeightOfOneBoxer) + " кг");


        // Задача 3.

        var bananas = 5*80;
        int milk = 2*105;
        var iceCream = 2*100;
        short chickenEggs = 4*70;
        float totalWeightOfProducts = bananas + milk + iceCream + chickenEggs;
        System.out.println("Общий вес продуктов в киллограмах " + totalWeightOfProducts/1000 + " кг");


        // Задача 4.

        int theAthleteNeedsToReset = 7*1000;
        short willLoseOne = 250;
        short willLoseTwo = 500;
        int slowlyLoseWeight = theAthleteNeedsToReset / willLoseOne; // по 250 грамм в день
        int loseWeightFast = theAthleteNeedsToReset / willLoseTwo; // по 500 грамм в день
        int takeDaysOnAverage = (slowlyLoseWeight + loseWeightFast) / 2; // в среднем
        System.out.println("Спортсмен сбросит 7 кг. веса за " + slowlyLoseWeight + " дней" + " если будет худеть на 250 гр. в день");
        System.out.println("Спортсмен сбросит 7 кг. веса за " + loseWeightFast + " дней" + " если будет худеть на 500 гр. в день");
        System.out.println("В среднем спортсмену потребуется " + takeDaysOnAverage + " день," + " чтобы похудеть на 7 кг.");


        // Задача 5.

        int MashaEarns = 67_760;
        float MashaNowEarns = MashaEarns + MashaEarns * 0.1f;
        System.out.println("Маша будет зарабатывать " + MashaNowEarns + " рублей" + " после повышения з.п. на 10%");

        int DenisEarns = 83_690;
        double DenisIsNowEarning = DenisEarns + DenisEarns * 0.1;
        System.out.println("Денис будет зарабатывать " + DenisIsNowEarning + " рублей" + " после повышения з.п. на 10%");

        var KristinaEarns = 76_230;
        var KristinaNowEarns = KristinaEarns + KristinaEarns * 0.1;
        System.out.println("Кристина будет зарабатывать " + KristinaNowEarns + " рублей" + " после повышения з.п. на 10%");

        int MashaEarnsForTheYear = MashaEarns * 12;
        float MashaNowEarnsInAYear = MashaNowEarns * 12f;
        float IncreasingMashaSIncome = MashaNowEarnsInAYear - MashaEarnsForTheYear;
        System.out.println("Маша будет зарабатывать после повышения " + MashaNowEarnsInAYear + " рублей в год");
        System.out.println("Доход Маши увеличился на " + IncreasingMashaSIncome + " в год");

        int DenisEarnsInAYear = DenisEarns * 12;
        double DenisNowEarnsInAYear = DenisIsNowEarning * 12;
        double DenisIncreasingIncome = DenisNowEarnsInAYear - DenisEarnsInAYear;
        System.out.println("Денис будет зарабатывать после повышения " + DenisNowEarnsInAYear + " рублей в год");
        System.out.println("Доход Дениса увеличился на " + DenisIncreasingIncome + " в год");

        int KristinaEarnsInAYear = KristinaEarns * 12;
        double KristinaNowEarnsInAYear = KristinaNowEarns * 12;
        double KristinaIncreasingIncome = KristinaNowEarnsInAYear - KristinaEarnsInAYear;
        System.out.println("Кристина будет зарабатывать после повышения " + KristinaNowEarnsInAYear + " рублей в год");
        System.out.println("Доход Кристины увеличился на " + KristinaIncreasingIncome + " в год");
    }
}