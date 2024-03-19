import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
      
        ArrayList<Country> countries = new ArrayList<>();
        ArrayList<City> cities = new ArrayList<>();


        countries.add(new Country("ALB", "Albania", "Europe", 3401200, 28748, 3205, 34));
        countries.add(new Country("AGO", "Angola", "Africa", 12878000, 1246700, 6648, 56));
        countries.add(new Country("AIA", "Anguilla", "North America", 8000, 96, 63.2, 62));


        cities.add(new City(5, "Amsterdam", 731200, "NLD"));
        cities.add(new City(3, "Herat", 186800, "AFG"));
        cities.add(new City(4, "Mazar-e-Sharif", 127800, "AFG"));
        
        Map<String, City> highestPopulatedCities = new HashMap<>();
        for (City city : cities) {
            String countryCode = city.getCountryCode();
            if (!highestPopulatedCities.containsKey(countryCode) ||
                city.getPopulation() > highestPopulatedCities.get(countryCode).getPopulation()) {
                highestPopulatedCities.put(countryCode, city);
            }
        }
        System.out.println("Highest Population Cities:");
        highestPopulatedCities.forEach((countryCode, city) ->
                System.out.println("Country: " + countryCode + ", City: " + city.getName() +
                        ", Population: " + city.getPopulation()));

        
        Map<String, Country> mostPopulatedCountries = new HashMap<>();
        for (Country country : countries) {
            String continent = country.getContinent();
            if (!mostPopulatedCountries.containsKey(continent) ||
                country.getPopulation() > mostPopulatedCountries.get(continent).getPopulation()) {
                mostPopulatedCountries.put(continent, country);
            }
        }
        System.out.println("\n Most Populated Countries by Continent : ");
        mostPopulatedCountries.forEach((continent, country) ->
                System.out.println("Continent: " + continent + ", Country: " + country.getName() +
                        ", Population: " + country.getPopulation()));

        
        City highestPopulatedCapital = null;
        for (City city : cities) {
            if (city.getId() == 1 && (highestPopulatedCapital == null ||
                city.getPopulation() > highestPopulatedCapital.getPopulation())) {
                highestPopulatedCapital = city;
            }
        }
        System.out.println("\n Highest Populated Capital City : ");
        if (highestPopulatedCapital != null) {
            System.out.println("City: " + highestPopulatedCapital.getName() +
                    ", Population: " + highestPopulatedCapital.getPopulation());
        }
    }
}
