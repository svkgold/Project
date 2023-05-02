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
        makeCapitalNewName(countries);
    }

    public static void print(Country countries[]) {
        System.out.println(" -----------------------------");
        for (int i = 0; i < countries.length; ++i) {
            String a = countries[i].getCountry_name();
            double b = countries[i].getCountry_square();
            double c = countries[i].getCountry_population();
            String d = countries[i].getCountry_capital();

            System.out.println("Название страны, площадь, население, столица - " + a + " " + b + " " + c + " " + d);
        }
    }

     public static void printAll(Country countries[]) {

         System.out.println(Arrays.toString(countries));



    }


    public static void russia() {
        Country russia = new Country();
       // russia.setCountry_name("");
         russia.setCountry_name("Russia");
        //russia.setCountry_square(-9);
        russia.setCountry_square(17.1);
        russia.setCountry_population(146.7);
        //russia.setCountry_population(146.7);
        russia.setCountry_capital("Moscow");
        //russia.setCountry_capital("");
        // russia.setCapital_population(12.6);
        russia.setCapital_population(12.6);

        System.out.println(russia.getCountry_name());
        System.out.println(russia);
        System.out.println("");

    }

    public static void andorra() {
        Country andorra = new Country();
        andorra.setCountry_name("Andorra");
        andorra.setCountry_square(0.467);
        andorra.setCountry_population(0.0854);
        andorra.setCountry_capital("Andorra la Vella");
        andorra.setCapital_population(0.0226);

        System.out.println(andorra.getCountry_name());
        System.out.println(andorra);
        System.out.println("");
    }

    public static void finland() {
        Country finland = new Country();
        finland.setCountry_name("Finland");
        finland.setCountry_square(0.338);
        finland.setCountry_population(5.5);
        finland.setCountry_capital("Helsinki");
        finland.setCapital_population(0.655);

        System.out.println(finland.getCountry_name());
        System.out.println(finland);
        System.out.println("");
    }

    public static void france() {
        Country france = new Country();
        france.setCountry_name("France");
        france.setCountry_square(0.6438);
        france.setCountry_population(67.8);
        france.setCountry_capital("Paris");
        france.setCapital_population(2.1);

        System.out.println(france.getCountry_name());
        System.out.println(france);
        System.out.println("");
    }

    public static void singapore() {
        Country singapore = new Country();
        singapore.setCountry_name("Singapore");
        singapore.setCountry_square(0.00725);
        singapore.setCountry_population(5.7);
        singapore.setCountry_capital("Singapore");
        //  singapore.setCapital_population(null);

        System.out.println(singapore.getCountry_name());
        System.out.println(singapore);
        System.out.println("");
    }

    public static void makeCapitalNewName(Country countries[]) {

      System.out.println(" -----------------------------");
      String a=countries[0].getCountry_capital();
      System.out.println("Предыдущее название столицы - " + a);
      String b=countries[0].setCountry_capital("Saint Petersburg");
      System.out.println("Обновленное название столицы - " + b);
    }
}