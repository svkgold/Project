package pack_two;

public class Country {

        private String country_name;
        private double country_square;
        private double country_population;
        private String country_capital;
        private double capital_population;

        Country Russia = new Country();
        Country Andorra = new Country();
        Country Finland = new Country();
        Country France = new Country();
        Country Singapore = new Country();


        public Country() {
            this.country_name = "Russia";
            this.country_square = 17.1;
            this.country_population = 146.7;
            this.country_capital = "Moscow";
            this.capital_population = 12.6;
        }

        public Country(String country_name, double country_square, double country_population,
                       String country_capital, double capital_population) {
        }

        public String getCountry_name() {
            return country_name;
        }

        public void setCountry_name(String country_name) {
            this.country_name = country_name;
        }

        public double getCountry_square() {
            return country_square;
        }

        public void setCountry_square(double country_square) {
            this.country_square = country_square;
        }

        public double getCountry_population() {
            return country_population;
        }

        public void setCountry_population(double country_population) {
            this.country_population = country_population;
        }

        public String getCountry_capital() {
            return country_capital;
        }

        public void setCountry_capital(String country_capital) {
            this.country_capital = country_capital;
        }

        public double getCapital_population() {
            return capital_population;
        }

        public void setCapital_population(double capital_population) {
            this.capital_population = capital_population;
        }

        @Override
        public String toString() {
            return "Country №1 {" +
                    "country_name='" + country_name + '\'' +
                    ", country_square=" + country_square +
                    ", country_population=" + country_population +
                    ", country_capital='" + country_capital + '\'' +
                    ", capital_population=" + capital_population +
                    '}';
        }
}