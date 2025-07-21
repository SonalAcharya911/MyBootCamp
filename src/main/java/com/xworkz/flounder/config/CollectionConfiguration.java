package com.xworkz.flounder.config;

import javafx.scene.effect.SepiaTone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class CollectionConfiguration {
    public CollectionConfiguration(){
        System.out.println("created CollectionConfiguration...");
    }

    @Bean
    public Collection getCollection(){
        return new ArrayList();
    }

    @Bean
    public Collection<String> getFruitArrayList(){

        System.out.println("registering getFruitArrayList into Spring Container");
        Collection<String> fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Guava");
        return fruits;
    }
    @Bean
    public Collection<String> getStudentNames(){
        Collection<String> names= new ArrayList<>(Arrays.asList("Sonal", "Saahil", "Devika", "Darshan", "Faine", "Hans"));
        return names;
    }

    @Bean
    public Collection<Integer> getRollNumbers(){
        Collection<Integer> rollNumbers=new ArrayList<>(Arrays.asList(37,29,24,12,26,27,44,10));
        return rollNumbers;
    }
    @Bean
    public ArrayList getArrayList(){
        return new ArrayList();
    }
    @Bean
    public LinkedList getLinkedList(){
        return new LinkedList();
    }
    @Bean
    public LinkedList<String> getFoodChain(){
        return new LinkedList<>(Arrays.asList("Worm","Insect","Frog","Snake","Eagle"));
    }
    @Bean
    public LinkedList<String> getWaterCycleStages() {
        return new LinkedList<>(Arrays.asList("Evaporation", "Condensation", "Precipitation", "Collection"));
    }
    @Bean
    public LinkedList<String> getProgrammingLanguages() {
        return new LinkedList<>(Arrays.asList("Java", "Python", "C++", "JavaScript", "Go"));
    }
    @Bean
    public LinkedList<String> getPlanetsInOrder() {
        return new LinkedList<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    }
    @Bean
    public Set<String> getColors(){
        return new HashSet<>(Arrays.asList("White","Black","Violet","Indigo","Blue","Green","Yellow","Orange","Red"));
    }

    @Bean
    public Set<String> getContinents() {
        return new HashSet<>(Arrays.asList("Asia", "Africa", "North America", "South America", "Antarctica", "Europe", "Australia"));
    }

    @Bean
    public Set<String> getOperatingSystems() {
        return new HashSet<>(Arrays.asList("Windows", "macOS", "Linux", "Android", "iOS", "Ubuntu", "Fedora"));
    }

    @Bean
    public Set<String> getIndianStates() {
        return new HashSet<>(Arrays.asList("Karnataka", "Maharashtra", "Tamil Nadu", "Kerala", "Gujarat", "Punjab", "West Bengal", "Rajasthan", "Bihar"));
    }

    @Bean
    public Set<String> getSocialMediaPlatforms() {
        return new HashSet<>(Arrays.asList("Instagram", "Facebook", "Twitter", "LinkedIn", "Snapchat", "Threads", "Reddit"));
    }

    @Bean
    public Set<String> getMountainRanges() {
        System.out.println("registering getMountainRanges into Spring Container");
        return new TreeSet<>(Arrays.asList("Himalayas", "Andes", "Rockies", "Alps", "Urals", "Carpathians", "Atlas", "Sierra Nevada"));
    }
    @Bean
    public Set<String> exploreContinents() {
        System.out.println("registering exploreContinents into Spring Container");
        return new TreeSet<>(Arrays.asList("Asia", "Africa", "North America", "South America", "Europe", "Australia", "Antarctica"));
    }

    @Bean
    public Set<String> discoverFestivals() {
        System.out.println("registering discoverFestivals into Spring Container");
        return new TreeSet<>(Arrays.asList("Diwali", "Christmas", "Eid", "Hanukkah", "Lunar New Year", "Thanksgiving", "Holi", "Ramadan"));
    }

    @Bean
    public Set<String> listElements() {
        System.out.println("registering listElements into Spring Container");
        return new TreeSet<>(Arrays.asList("Hydrogen", "Oxygen", "Carbon", "Nitrogen", "Helium", "Iron", "Gold", "Silver"));
    }

    @Bean
    public Set<String> getStoryGenres() {
        System.out.println("registering getStoryGenres into Spring Container");
        return new TreeSet<>(Arrays.asList("Mystery", "Fantasy", "Adventure", "Romance", "Thriller", "Horror", "Drama", "Comedy"));
    }
    @Bean
    public Set<String> listLanguages() {
        System.out.println("registering listLanguages into Spring Container");
        return new HashSet<>(Arrays.asList("English", "Spanish", "Mandarin", "Hindi", "Arabic", "Russian", "French", "German"));
    }

    @Bean
    public Set<String> getOperatingSystemsNames() {
        System.out.println("registering getOperatingSystemsNames into Spring Container");
        return new HashSet<>(Arrays.asList("Windows", "macOS", "Linux", "Android", "iOS", "ChromeOS", "Ubuntu", "Fedora"));
    }

    @Bean
    public Set<String> findPlanets() {
        System.out.println("registering findPlanets into Spring Container");
        return new HashSet<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    }

    @Bean
    public Set<String> loadMusicalInstruments() {
        System.out.println("registering loadMusicalInstruments into Spring Container");
        return new HashSet<>(Arrays.asList("Guitar", "Piano", "Violin", "Drums", "Flute", "Trumpet", "Cello", "Saxophone"));
    }

    @Bean
    public Set<String> fetchProgrammingLanguages() {
        System.out.println("registering fetchProgrammingLanguages into Spring Container");
        return new HashSet<>(Arrays.asList("Java", "Python", "C++", "JavaScript", "Go", "Swift", "Kotlin", "Ruby"));
    }

    @Bean
    public Set<String> provideFestivals() {
        System.out.println("registering provideFestivals into Spring Container");
        return new LinkedHashSet<>(Arrays.asList("Diwali", "Christmas", "Eid", "Holi", "Thanksgiving", "Hanukkah", "Onam", "Pongal"));
    }

    @Bean
    public Set<String> loadCarBrands() {
        System.out.println("registering loadCarBrands into Spring Container");
        return new LinkedHashSet<>(Arrays.asList("Toyota", "Ford", "BMW", "Mercedes", "Audi", "Tesla", "Honda", "Hyundai"));
    }

    @Bean
    public Set<String> getBirdSpecies() {
        System.out.println("registering getBirdSpecies into Spring Container");
        return new LinkedHashSet<>(Arrays.asList("Peacock", "Sparrow", "Parrot", "Eagle", "Owl", "Flamingo", "Penguin", "Swan"));
    }

    @Bean
    public Set<String> fetchContinents() {
        System.out.println("registering fetchContinents into Spring Container");
        return new LinkedHashSet<>(Arrays.asList("Asia", "Africa", "North America", "South America", "Europe", "Australia", "Antarctica"));
    }

    @Bean
    public Set<String> listBoardGames() {
        System.out.println("registering listBoardGames into Spring Container");
        return new LinkedHashSet<>(Arrays.asList("Chess", "Monopoly", "Scrabble", "Catan", "Ludo", "Checkers", "Clue", "Carrom"));
    }

    @Bean
    public Map<String, String> getStateCapitals() {
        System.out.println("registering getStateCapitals into Spring Container");
        Map<String, String> map = new HashMap<>();
        map.put("Karnataka", "Bengaluru");
        map.put("Maharashtra", "Mumbai");
        map.put("Tamil Nadu", "Chennai");
        map.put("Gujarat", "Gandhinagar");
        return map;
    }

    @Bean
    public Map<Integer, String> mapPlanetOrders() {
        System.out.println("registering mapPlanetOrders into Spring Container");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mercury");
        map.put(2, "Venus");
        map.put(3, "Earth");
        map.put(4, "Mars");
        return map;
    }

    @Bean
    public Map<String, Integer> assignPinCodes() {
        System.out.println("registering assignPinCodes into Spring Container");
        Map<String, Integer> map = new HashMap<>();
        map.put("Kaggadaspura",560093);
        map.put("HAL",560017);
        map.put("Kundalahalli", 560037);
        map.put("BTM",560074);
        return map;
    }

    @Bean
    public Map<String, Boolean> checkPrimeStatus() {
        System.out.println("registering checkPrimeStatus into Spring Container");
        Map<String, Boolean> map = new HashMap<>();
        map.put("2", true);
        map.put("4", false);
        map.put("5", true);
        map.put("6", false);
        return map;
    }

    @Bean
    public Map<String, Double> getItemPrices() {
        System.out.println("registering getItemPrices into Spring Container");
        Map<String, Double> map = new HashMap<>();
        map.put("Milk", 21.0);
        map.put("Bread", 30.0);
        map.put("Eggs", 70.0);
        return map;
    }

    @Bean
    public Map<String, Integer> storeMovieRatings() {
        System.out.println("registering storeMovieRatings into Spring Container");
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Inception", 9);
        map.put("Titanic", 8);
        map.put("Joker", 9);
        return map;
    }

    @Bean
    public Map<String, String> rememberAuthors() {
        System.out.println("registering rememberAuthors into Spring Container");
        Map<String, String> map = new LinkedHashMap<>();
        map.put("1984", "George Orwell");
        map.put("Othello", "Shakespeare");
        map.put("The Alchemist", "Paulo Coelho");
        return map;
    }

    @Bean
    public Map<Integer, String> maintainStudentIds() {
        System.out.println("registering maintainStudentIds into Spring Container");
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "Sonal");
        map.put(102, "Arav");
        map.put(103, "Neha");
        return map;
    }

    @Bean
    public Map<String, Character> defineGrades() {
        System.out.println("registering defineGrades into Spring Container");
        Map<String, Character> map = new LinkedHashMap<>();
        map.put("Maths", 'A');
        map.put("Physics", 'B');
        map.put("Chemistry", 'A');
        return map;
    }

    @Bean
    public Map<String, Float> collectTemperatures() {
        System.out.println("registering collectTemperatures into Spring Container");
        Map<String, Float> map = new LinkedHashMap<>();
        map.put("Bangalore", 29.4f);
        map.put("Delhi", 36.5f);
        map.put("Mumbai", 33.2f);
        return map;
    }

    @Bean
    public Map<String, String> sortLanguages() {
        System.out.println("registering sortLanguages into Spring Container");
        Map<String, String> map = new TreeMap<>();
        map.put("Python", "Easy");
        map.put("Java", "Moderate");
        map.put("C++", "Hard");
        return map;
    }

    @Bean
    public Map<Integer, String> organizeRanks() {
        System.out.println("registering organizeRanks into Spring Container");
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Gold");
        map.put(2, "Silver");
        map.put(3, "Bronze");
        return map;
    }

    @Bean
    public Map<String, Integer> sortCitiesByName() {
        System.out.println("registering sortCitiesByName into Spring Container");
        Map<String, Integer> map = new TreeMap<>();
        map.put("Chennai", 600001);
        map.put("Bangalore", 560001);
        map.put("Ahmedabad", 380001);
        return map;
    }

    @Bean
    public Map<Character, Boolean> flagVowels() {
        System.out.println("registering flagVowels into Spring Container");
        Map<Character, Boolean> map = new TreeMap<>();
        map.put('A', true);
        map.put('B', false);
        map.put('E', true);
        return map;
    }

    @Bean
    public Map<String, String> getSortedCurrencies() {
        System.out.println("registering getSortedCurrencies into Spring Container");
        Map<String, String> map = new TreeMap<>();
        map.put("INR", "Rupee");
        map.put("USD", "Dollar");
        map.put("JPY", "Yen");
        return map;
    }

    @Bean
    public Hashtable<String, String> loadHttpCodes() {
        System.out.println("registering loadHttpCodes into Spring Container");
        Hashtable<String, String> map = new Hashtable<>();
        map.put("200", "OK");
        map.put("404", "Not Found");
        map.put("500", "Server Error");
        return map;
    }

    @Bean
    public Hashtable<String, Integer> storeInventory() {
        System.out.println("registering storeInventory into Spring Container");
        Hashtable<String, Integer> map = new Hashtable<>();
        map.put("Pen", 120);
        map.put("Notebook", 80);
        map.put("Eraser", 40);
        return map;
    }

    @Bean
    public Hashtable<String, Boolean> verifyPermissions() {
        System.out.println("registering verifyPermissions into Spring Container");
        Hashtable<String, Boolean> map = new Hashtable<>();
        map.put("READ", true);
        map.put("WRITE", false);
        map.put("EXECUTE", true);
        return map;
    }

    @Bean
    public Hashtable<Integer, String> labRoomMappiing() {
        System.out.println("registering labRoomMapping into Spring Container");
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(101, "Computer Lab");
        map.put(102, "CAD Lab");
        map.put(103, "Seminar Hall");
        return map;
    }

    @Bean
    public Hashtable<String, Double> assignScores() {
        System.out.println("registering assignScores into Spring Container");
        Hashtable<String, Double> map = new Hashtable<>();
        map.put("Abhin", 85.5);
        map.put("Murali", 78.0);
        map.put("Chethan", 92.3);
        return map;
    }

    @Bean
    public Properties configureDatabaseProps() {
        System.out.println("registering configureDatabaseProps into Spring Container");
        Properties props = new Properties();
        props.setProperty("url", "jdbc:mysql://localhost:3306/db");
        props.setProperty("username", "root");
        props.setProperty("password", "admin");
        return props;
    }

    @Bean
    public Properties getMailID() {
        System.out.println("registering getMailID into Spring Container");
        Properties props = new Properties();
        props.setProperty("sonal@gmail.com", "sonal");
        props.setProperty("saahil@gmail.com", "saahil");
        props.setProperty("vidya@gmail.com", "vidya");
        return props;
    }

    @Bean
    public Properties loadApplicationModes() {
        System.out.println("registering loadApplicationModes into Spring Container");
        Properties props = new Properties();
        props.setProperty("development", "true");
        props.setProperty("production", "false");
        return props;
    }

    @Bean
    public Properties getUiTextLabels() {
        System.out.println("registering getUiTextLabels into Spring Container");
        Properties props = new Properties();
        props.setProperty("welcome", "Welcome User");
        props.setProperty("logout", "Logout");
        props.setProperty("submit", "Submit");
        return props;
    }

    @Bean
    public Properties provideThemeSettings() {
        System.out.println("registering provideThemeSettings into Spring Container");
        Properties props = new Properties();
        props.setProperty("theme", "dark");
        props.setProperty("font.size", "14");
        props.setProperty("font.family", "Arial");
        return props;
    }

    @Bean
    public String[] getNameArray(){
        System.out.println("registering getNameArray into Spring Container");
        String[] names=new String[]{"Sonal","Saahil","Natasha","Chandrababu","Anil","Akhil","Amala"};
        return names;
    }













}
