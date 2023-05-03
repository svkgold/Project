package pack_two;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Вывод информации по всем странам и всем параметрам. Страны как отдельные объекты: ");
        System.out.println("");
        russia();
        andorra();
        france();
        finland();
        singapore();

        Country[] countries = new Country[]{new Country(), new Country(), new Country(),
                new Country(), new Country()};
        countries[0].setCountry("Russia", 17.1, 146.7,
                "Moscow", 12.6);
        countries[1].setCountry("Andorra", 0.467, 0.0854,
                "Andorra la Vella", 0.0226);
        countries[2].setCountry("Finland", 0.338, 5.5,
                "Helsinki", 0.655);
        countries[3].setCountry("France", 0.6438, 67.8,
                "Paris", 2.1);

        countries[4].setCountry("Singapore", 0.00725, 5.7,
                "Singapore", 1.2);

        System.out.println("____________________");
        System.out.println("Выводится информация по странам из массива со всеми странами раздельно: ");
        System.out.println(" ");
        System.out.println(countries[0]);
        System.out.println(countries[1]);
        System.out.println(countries[2]);
        System.out.println(countries[3]);
        System.out.println(countries[4]);
        System.out.println("---------------------------------");
        System.out.println("Выводится информация по странам в массиве, в одной строке: ");
        System.out.println(" ");
        printAll(countries);
        print(countries);
        singaporeNew();
        russiaNew();
        makeCapitalNewName(countries);
    }

    public static void print(Country countries[]) {
        System.out.println(" -----------------------------");
        System.out.println("Выводится информация название страны, площадь, население, столица: ");
        System.out.println(" ");
        for (int i = 0; i < countries.length; ++i) {
            String a = countries[i].getCountryName();
            double b = countries[i].getCountrySquare();
            double c = countries[i].getCountryPopulation();
            String d = countries[i].getCountryCapital();
            System.out.println("Название страны, площадь, население, столица - " + a + " " + b + " " + c + " " + d);
        }
    }

    public static void printAll(Country countries[]) {

        System.out.println(Arrays.toString(countries));
    }

    public static void russia() {
        Country russia = new Country();
        russia.setCountryName("Russia");
        russia.setCountrySquare(17.1);
        russia.setCountryPopulation(146.7);
        russia.setCountryCapital("Moscow");
        russia.setCapitalPopulation(12.6);
        System.out.println(russia.getCountryName());
        System.out.println(russia);
        System.out.println("");
    }

    public static void andorra() {
        Country andorra = new Country();
        andorra.setCountryName("Andorra");
        andorra.setCountrySquare(0.467);
        andorra.setCountryPopulation(0.0854);
        andorra.setCountryCapital("Andorra la Vella");
        andorra.setCapitalPopulation(0.0226);
        System.out.println(andorra.getCountryName());
        System.out.println(andorra);
        System.out.println("");
    }

    public static void finland() {
        Country finland = new Country();
        finland.setCountryName("Finland");
        finland.setCountrySquare(0.338);
        finland.setCountryPopulation(5.5);
        finland.setCountryCapital("Helsinki");
        finland.setCapitalPopulation(0.655);
        System.out.println(finland.getCountryName());
        System.out.println(finland);
        System.out.println("");
    }

    public static void france() {
        Country france = new Country();
        france.setCountryName("France");
        france.setCountrySquare(0.6438);
        france.setCountryPopulation(67.8);
        france.setCountryCapital("Paris");
        france.setCapitalPopulation(2.1);
        System.out.println(france.getCountryName());
        System.out.println(france);
        System.out.println("");
    }

    public static void singapore() {
        Country singapore = new Country();
        singapore.setCountryName("Singapore");
        singapore.setCountrySquare(0.00725);
        singapore.setCountryPopulation(5.7);
        singapore.setCountryCapital("Singapore");
        System.out.println(singapore.getCountryName());
        System.out.println(singapore);
        System.out.println("");
    }

    public static void singaporeNew() {

        Country singaporeNew = new Country("Singapore", 0.00725, 5.7);
        String a = singaporeNew.getCountryName();
        double b = singaporeNew.getCountrySquare();
        double c = singaporeNew.getCountryPopulation();
        System.out.println("");
        System.out.println("Отдельный вывод информации по Сингапуру: название - " + a +
                ", площадь - " + b + ", население - " + c);
    }

    public static void russiaNew() {

        Country russiaNew = new Country("Russia", 17.1, 146.7,
                "Moscow", 12.6);
        String a = russiaNew.getCountryName();
        double b = russiaNew.getCountrySquare();
        double c = russiaNew.getCountryPopulation();
        String f = russiaNew.getCountryCapital();
        double d = russiaNew.getCapitalPopulation();
        System.out.println("");
        System.out.println("Отдельный вывод информации по Россия: название страны - " + a +
                ", площадь страны - " + b + ", население страны - " + c + ", столица - " + f +
                ", население столицы - " + d);
    }

    public static void makeCapitalNewName(Country countries[]) {
        System.out.println(" -----------------------------");
        System.out.println("Сброс и смена столицы страны: ");
        System.out.println(" ");
        String a = countries[0].getCountryCapital();
        System.out.println("Предыдущее название столицы - " + a);
        String b = countries[0].setCountryCapital("Saint Petersburg");
        System.out.println("Обновленное название столицы - " + b);
    }
}