package pack_two;

import java.util.Objects;

public class Country {

    private String countryName;
    private double countrySquare;
    private double countryPopulation;
    private String countryCapital;
    private double capitalPopulation;

    public Country(String countryName, double countrySquare, double countryPopulation,
                   String countryCapital, double capitalPopulation) {
    }
    public Country(String countryName, double countrySquare, double countryPopulation) {
    }
    public Country() {
    }
    public void setCountry(String countryName, double countrySquare, double countryPopulation,
                           String countryCapital, double capitalPopulation) throws IllegalArgumentException {

        this.countryName = countryName;
        if (countryName ==null || countryName.equals("")) {
            throw new IllegalArgumentException("Название страны не задано");
        }
        this.countrySquare = countrySquare;
        if (countrySquare <= 0) {
            throw new IllegalArgumentException("Площадь страны задана меньше или равно 0," +
                    " задайте положительное число");
        }
        if (Objects.equals(countrySquare, null)) {
            throw new IllegalArgumentException("Площадь страны задана null");
        }
        this.countryPopulation = countryPopulation;
        if (countryPopulation <= 0) {
            throw new IllegalArgumentException("Население страны меньше или равно 0 ");
        }
        this.countryCapital = countryCapital;
        if (countryCapital.equals("")) {
            throw new IllegalArgumentException("Название столицы не задано");
        }
        this.capitalPopulation = capitalPopulation;
        if (capitalPopulation <= 0) {
            throw new IllegalArgumentException("Население столицы меньше или равно 0");
        }
    }
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
        if (countryName ==null || countryName.equals("")) {
            System.out.println("Название страны не задано");
        }
    }
    public double getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(double countryPopulation) {

        this.countryPopulation = countryPopulation;
        if (countryPopulation<=0) {
            System.out.println("Население страны задано меньше или равно 0," +
                    " задайте положительное число");
        }
    }
    public double getCountrySquare() {
        return countrySquare;
    }
    public void setCountrySquare(double countrySquare) {
        this.countrySquare = countrySquare;
        if (countrySquare <= 0) {
            System.out.println("Население страны задано меньше или равно 0," +
                    " задайте положительное число");
        }
    }
    public String getCountryCapital() {
        return countryCapital;
    }

    public String setCountryСapital(String countryСapital) throws IllegalArgumentException {
        this.countryCapital = countryСapital;
        if (countryСapital.equals("")) {
            throw new IllegalArgumentException("Название столицы не задано");
        }
        return countryСapital;
    }
    public double getCapitalPopulation() {
        return capitalPopulation;
    }

    public void setCapitalPopulation(double capitalPopulation) {
        this.capitalPopulation = capitalPopulation;
        if (capitalPopulation <= 0) {
            System.out.println("Население столицы задано меньше или равно 0," +
                    " задайте положительное число");
        }
    }
    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", countrySquare=" + countrySquare +
                ", countryPopulation=" + countryPopulation +
                ", countryCapital='" + countryCapital + '\'' +
                ", capitalPopulation=" + capitalPopulation +
                '}';
    }
}