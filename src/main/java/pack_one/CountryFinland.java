package pack_one;

public class CountryFinland {
    private String country_name1;

    // Square is set in millions
    private double country_square1;
    private double country_population1;
    private String country_capital1;

    // Capital population is set in millions
    private double capital_population1;

    public CountryFinland() {
        this.country_name1 = "Finland";
        this.country_square1 = 0.338;
        this.country_population1 = 5.5;
        this.country_capital1 = "Helsinki";
        this.capital_population1 = 0.655;
    }

    public String getCountry_name1() {
        return country_name1;
    }

    public void setCountry_name1(String country_name1) {
        this.country_name1 = country_name1;
    }

    public double getCountry_square1() {
        return country_square1;
    }

    public void setCountry_square1(double country_square1) {
        this.country_square1 = country_square1;
    }

    public double getCountry_population1() {
        return country_population1;
    }

    public void setCountry_population1(double country_population1) {
        this.country_population1 = country_population1;
    }

    public String getCountry_capital1() {
        return country_capital1;
    }

    public void setCountry_capital1(String country_capital1) {
        this.country_capital1 = country_capital1;
    }

    public double getCapital_population1() {
        return capital_population1;
    }

    public void setCapital_population1(double capital_population1) {
        this.capital_population1 = capital_population1;
    }

    @Override
    public String toString() {
        return "Country №2 {" +
                "country_name1='" + country_name1 + '\'' +
                ", country_square1=" + country_square1 +
                ", country_population1=" + country_population1 +
                ", country_capital1='" + country_capital1 + '\'' +
                ", capital_population1=" + capital_population1 +
                '}';
    }
}