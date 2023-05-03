package pack_two;

public class Country {

    private String countryName;
    private double countrySquare;
    private double countryPopulation;
    private String countryCapital;
    private double capitalPopulation;

    public Country() {
    }

    public Country(String countryName, double countrySquare, double countryPopulation) {

        setCountryName(countryName);
        setCountrySquare(countrySquare);
        setCountryPopulation(countryPopulation);
    }

    public Country(String countryName, double countrySquare, double countryPopulation,
                   String countryCapital, double capitalPopulation) {

        setCountryName(countryName);
        setCountrySquare(countrySquare);
        setCountryPopulation(countryPopulation);
        setCountryCapital(countryCapital);
        setCapitalPopulation(capitalPopulation);
    }

    public String getCountryName() {

        return countryName;
    }

    public double getCountryPopulation() {

        return countryPopulation;
    }

    public double getCountrySquare() {

        return countrySquare;
    }

    public String getCountryCapital() {

        return countryCapital;
    }

    public double getCapitalPopulation() {

        return capitalPopulation;
    }
    public void setCountry(String countryName, double countrySquare, double countryPopulation,
                           String countryCapital, double capitalPopulation)  {

        setCountryName(countryName);
        setCountrySquare(countrySquare);
        setCountryCapital(countryCapital);
        setCountryPopulation(countryPopulation);
        setCapitalPopulation(capitalPopulation);
    }
    public void setCountryName(String countryName) {

        if (countryName == null || countryName.equals("")) {
            throw new IllegalArgumentException("Название страны не задано");
        } else
        this.countryName = countryName;
    }

    public void setCountryPopulation(double countryPopulation) {

        if (countryPopulation <= 0) {
            throw new IllegalArgumentException("Население страны задано меньше или равно 0," +
                    " задайте положительное число");
        } else
        this.countryPopulation = countryPopulation;
    }

    public void setCountrySquare(double countrySquare) {

        if (countrySquare <= 0) {
            throw new IllegalArgumentException("Площадь страны задано меньше или равно 0," +
                    " задайте положительное число");
        } else
        this.countrySquare = countrySquare;
    }

    public String setCountryCapital(String countryCapital) {

        if (countryCapital == null || countryCapital.equals("")) {
            throw new IllegalArgumentException("Название столицы не задано");
        }
        else
        this.countryCapital = countryCapital;
        return countryCapital;
    }

    public void setCapitalPopulation(double capitalPopulation) {

        if (capitalPopulation <= 0) {
            throw new IllegalArgumentException("Население столицы задано меньше или равно 0," +
                    " задайте положительное число");
        }
        else
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