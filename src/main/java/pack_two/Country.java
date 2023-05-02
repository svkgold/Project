package pack_two;

import java.util.Objects;

public class Country {

    private String country_name;
    private double country_square;
    private double country_population;
    private String country_capital;
    private double capital_population;


    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {

        this.country_name = country_name;
        if (country_name.equals("") || country_name.equals(null)) {
            System.out.println("Название страны не задано");
        }
    }
    public void setCountry_name_empty(String country_name) {
        this.country_name = "";
    }
    public double getCountry_square() {
        return country_square;
    }
    public void setCountry_square(double country_square) {
        this.country_square = country_square;
        if (country_square <= 0) {
            System.out.println("Площадь столицы задана меньше или равно 0," +
                    " задайте положительное число");
        }
        if (Objects.equals(country_square, null)) {
            System.out.println("Площадь столицы задана null");
        }
    }
    public double getCountry_population() {
        return country_population;
    }
    public void setCountry_population(double country_population) {
        this.country_population = country_population;
        if (country_population <= 0) {
            System.out.println("Население страны задано меньше или равно 0," +
                    " задайте положительное число");
        }
    }
    public String getCountry_capital() {
        return country_capital;
    }

    public String setCountry_capital(String country_capital) throws IllegalArgumentException {
        this.country_capital = country_capital;
        if (country_capital.equals("")) {
            throw new IllegalArgumentException("Название столицы не задано");
        }
        return country_capital;
    }
    public double getCapital_population() {
        return capital_population;
    }

    public void setCapital_population(double capital_population) {
        this.capital_population = capital_population;
        if (capital_population <= 0) {
            System.out.println("Население столицы задано меньше или равно 0," +
                    " задайте положительное число");
        }
    }
    @Override
    public String toString() {
        return "Country{" +
                "country_name='" + country_name + '\'' +
                ", country_square=" + country_square +
                ", country_population=" + country_population +
                ", country_capital='" + country_capital + '\'' +
                ", capital_population=" + capital_population +
                '}';
    }
    public Country(String country_name, double country_square, double country_population,
                   String country_capital, double capital_population) {
    }

    public Country() {
    }
    public void setCountry(String country_name, double country_square, double country_population,
                           String country_capital, double capital_population) throws IllegalArgumentException {

        this.country_name = country_name;
        if (country_name.equals("")) {
            throw new IllegalArgumentException("Название страны не задано");
        }
        this.country_square = country_square;
        if (country_square <= 0) {
            throw new IllegalArgumentException("Площадь страны задана меньше или равно 0," +
                    " задайте положительное число");
        }
        if (Objects.equals(country_square, null)) {
            throw new IllegalArgumentException("Площадь страны задана null");
        }
        this.country_population = country_population;
        if (country_population <= 0) {
            throw new IllegalArgumentException("Население страны меньше или равно 0 ");
        }
        this.country_capital = country_capital;
        if (country_capital.equals("")) {
            throw new IllegalArgumentException("Название столицы не задано");
        }
        this.capital_population = capital_population;
        if (capital_population <= 0) {
            throw new IllegalArgumentException("Население столицы меньше или равно 0");
        }
    }
}