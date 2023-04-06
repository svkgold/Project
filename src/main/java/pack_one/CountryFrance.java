package pack_one;

public class CountryFrance {

    private String country_name2;

    // Square is set in millions
    private double country_square2;
    private double country_population2;
    private String country_capital2;

    // Capital population is set in millions
    private double capital_population2;

    public CountryFrance() {
        this.country_name2 = "France";
        this.country_square2 = 0.6438;
        this.country_population2 = 67.8;
        this.country_capital2 = "Paris";
        this.capital_population2 = 2.1;
    }

    public String getCountry_name2() {
        return country_name2;
    }

    public void setCountry_name2(String country_name2) {
        this.country_name2 = country_name2;
    }

    public double getCountry_square2() {
        return country_square2;
    }

    public void setCountry_square2(double country_square2) {
        this.country_square2 = country_square2;
    }

    public double getCountry_population2() {
        return country_population2;
    }

    public void setCountry_population2(double country_population2) {
        this.country_population2 = country_population2;
    }

    public String getCountry_capital2() {
        return country_capital2;
    }

    public void setCountry_capital2(String country_capital2) {
        this.country_capital2 = country_capital2;
    }

    public double getCapital_population2() {
        return capital_population2;
    }

    public void setCapital_population2(double capital_population2) {
        this.capital_population2 = capital_population2;
    }

    @Override
    public String toString() {
        return "Country №3 {" +
                "country_name2='" + country_name2 + '\'' +
                ", country_square2=" + country_square2 +
                ", country_population2=" + country_population2 +
                ", country_capital2='" + country_capital2 + '\'' +
                ", capital_population2=" + capital_population2 +
                '}';
    }
}