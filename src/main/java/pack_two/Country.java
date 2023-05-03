package pack_two;

import java.util.Objects;

public class Country {

    private String countryName;
    private double countrySquare;
    private double countryPopulation;
    private String countryCapital;
    private double capitalPopulation;

    public Country() {
    }

    public Country(String countryName, double countrySquare, double countryPopulation) {
        this.countryName = countryName;
        this.countrySquare = countrySquare;
        this.countryPopulation = countryPopulation;
    }

    public Country(String countryName, double countrySquare, double countryPopulation,
                   String countryCapital, double capitalPopulation) {
    }

    public void setCountry(String countryName, double countrySquare, double countryPopulation,
                           String countryCapital, double capitalPopulation) throws IllegalArgumentException {

        if (countryName ==null || countryName.equals("")) {
            throw new IllegalArgumentException("Название страны не задано");
        }
        this.countryName = countryName;

        if (countrySquare <= 0) {
            throw new IllegalArgumentException("Площадь страны задана меньше или равно 0," +
                    " задайте положительное число");
        }
        if (Objects.equals(countrySquare, null)) {
        throw new IllegalArgumentException("Площадь страны задана null");
        }
        this.countrySquare = countrySquare;

        if (countryPopulation <= 0) {
        throw new IllegalArgumentException("Население страны меньше или равно 0 ");
        }
        this.countryPopulation = countryPopulation;


        if (countryCapital ==null || countryCapital.equals("")) {
            throw new IllegalArgumentException("Название столицы не задано");
        }
        this.countryCapital = countryCapital;

        if (capitalPopulation <= 0) {
        throw new IllegalArgumentException("Население столицы меньше или равно 0");
        }
        this.capitalPopulation = capitalPopulation;
    }
    public String getCountryName() {

        return countryName;
    }

    public void setCountryName(String countryName) {

        if (countryName ==null || countryName.equals("")) {
            System.out.println("Название страны не задано");
        }
        this.countryName = countryName;
    }
    public double getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(double countryPopulation) {

        if (countryPopulation<=0) {
            System.out.println("Население страны задано меньше или равно 0," +
                    " задайте положительное число");
        }
        this.countryPopulation = countryPopulation;
    }

    public double getCountrySquare() {

        return countrySquare;
    }

    public void setCountrySquare(double countrySquare) {

        if (countrySquare <= 0) {
            System.out.println("Площадь страны задано меньше или равно 0," +
                    " задайте положительное число");
        }
        this.countrySquare = countrySquare;
    }
    public String getCountryCapital() {

        return countryCapital;
    }

    public String setCountryCapital(String countryСapital)  {


        this.countryCapital = countryСapital;
        return countryСapital;
    }

    public void setCapitalPopulation(double capitalPopulation) {

        if (capitalPopulation <= 0) {
            System.out.println("Население столицы задано меньше или равно 0," +
                    " задайте положительное число");
        }
        this.capitalPopulation = capitalPopulation;
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