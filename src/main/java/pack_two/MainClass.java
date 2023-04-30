package pack_two;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Вывод информации по стране по трем параметрам: название, площадь, население: ");
        System.out.println("");
        print();
        System.out.println("");
        System.out.println("Вывод информации по всем странам и всем параметрам: ");
        System.out.println("");
        printAll();
        makeCapitalEmpty();
    }

    public static void print() {
       CountryRussia countryRussia = new CountryRussia();
       System.out.println(countryRussia.getCountry_name() + ", " + countryRussia.getCountry_square() + ", " +
               countryRussia.getCountry_population());
    }

    public static void printAll() {
        CountryRussia countryRussia = new CountryRussia();
        checkIncorrectValues(countryRussia);
        CountryRussia[] countryRussiaArray = new CountryRussia[]{countryRussia};
        System.out.println(Arrays.toString(countryRussiaArray));

        CountryFinland[] countryFinland = new CountryFinland[]{new CountryFinland()};
        System.out.println(Arrays.toString(countryFinland));

        CountryFrance[] countryFrance = new CountryFrance[]{new CountryFrance()};
        System.out.println(Arrays.toString(countryFrance));

        CountryAndorra[] countryAndorra = new CountryAndorra[]{new CountryAndorra()};
        System.out.println(Arrays.toString(countryAndorra));

        CountrySingapore countrySingapore = new CountrySingapore();
        countrySingapore.setCapital_population4("data is not applied");
        System.out.println(Arrays.toString(new CountrySingapore[]{countrySingapore}));
    }

    public static void checkIncorrectValues(CountryRussia country_Russia) throws IllegalArgumentException {
        if (country_Russia.getCountry_square() <=0 || country_Russia.getCountry_population()<=0) {

            throw new IllegalArgumentException("Площадь страны или население задано <= 0");
        }
     }
    public static void makeCapitalEmpty() {
        CountryRussia countryRussia = new CountryRussia();
        System.out.println(" -----------------------------");
        System.out.println("Предыдущее название столицы - " + countryRussia.getCountry_capital());
        countryRussia.setCountry_capital("");
        System.out.println("Название столицы установлено empty - " + countryRussia.getCountry_capital());
        System.out.println(Arrays.toString(new CountryRussia[]{countryRussia}));
     }}