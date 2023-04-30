package pack_two;

public class CountrySingapore {

    private String country_name4;

    // Square is set in millions
    private double country_square4;
    private double country_population4;
    private String country_capital4;

    // Capital population is set in millions
    private String capital_population4;

    public CountrySingapore() {
        this.country_name4 = "Singapore";
        this.country_square4 = 0.00725;
        this.country_population4 = 5.7;
        this.country_capital4 = "Singapore";
    }

    public String getCountry_name4() {
        return country_name4;
    }

    public void setCountry_name4(String country_name4) {
        this.country_name4 = country_name4;
    }

    public double getCountry_square4() {
        return country_square4;
    }

    public void setCountry_square4(double country_square4) {
        this.country_square4 = country_square4;
    }

    public double getCountry_population4() {
        return country_population4;
    }

    public void setCountry_population4(double country_population4) {
        this.country_population4 = country_population4;
    }

    public String getCountry_capital4() {
        return country_capital4;
    }

    public void setCountry_capital4(String country_capital4) {
        this.country_capital4 = country_capital4;
    }

    public String getCapital_population4() {
        return capital_population4;
    }

    public void setCapital_population4(String capital_population4) {
        this.capital_population4 = capital_population4;
    }

    @Override
    public String toString() {
        return "Country №5 {" +
                "country_name4='" + country_name4 + '\'' +
                ", country_square4=" + country_square4 +
                ", country_population4=" + country_population4 +
                ", country_capital4='" + country_capital4 + '\'' +
                ", capital_population4='" + capital_population4 + '\'' +
                '}';
    }
}