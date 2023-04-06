package pack_one;

public class CountryAndorra {

    private String country_name3;

    // Square is set in millions
    private double country_square3;
    private double country_population3;
    private String country_capital3;

    // Capital population is set in millions
    private double capital_population3;

    public CountryAndorra() {
        this.country_name3 = "Andorra";
        this.country_square3 = 0.467;
        this.country_population3 = 0.0854;
        this.country_capital3 = "Andorra la Vella";
        this.capital_population3 = 0.0226;
    }

    public String getCountry_name3() {
        return country_name3;
    }

    public void setCountry_name3(String country_name3) {
        this.country_name3 = country_name3;
    }

    public double getCountry_square3() {
        return country_square3;
    }

    public void setCountry_square3(double country_square3) {
        this.country_square3 = country_square3;
    }

    public double getCountry_population3() {
        return country_population3;
    }

    public void setCountry_population3(double country_population3) {
        this.country_population3 = country_population3;
    }

    public String getCountry_capital3() {
        return country_capital3;
    }

    public void setCountry_capital3(String country_capital3) {
        this.country_capital3 = country_capital3;
    }

    public double getCapital_population3() {
        return capital_population3;
    }

    public void setCapital_population3(double capital_population3) {
        this.capital_population3 = capital_population3;
    }

    @Override
    public String toString() {
        return "Country №4 {" +
                "country_name3='" + country_name3 + '\'' +
                ", country_square3=" + country_square3 +
                ", country_population3=" + country_population3 +
                ", country_capital3='" + country_capital3 + '\'' +
                ", capital_population3=" + capital_population3 +
                '}';
    }
}