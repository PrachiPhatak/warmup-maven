public class CountriesApp {
    public static void main(String[] args) {
        Country country = new Country("India","Delhi",17.7);
        System.out.println(country.name);
        System.out.println(country.capital);
        System.out.println(country.worldShare);
    }
}
