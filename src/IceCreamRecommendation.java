import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
This class is used to store the sales of ice cream flavors in a collection. The collection is then used to recommend the three most popular flavor to the user. The
The collection is sorted in descending order by the number of sales as soon as an item is added
Each entry in the collection for sales
consists of th flavour and the number of items sold
 */
public class IceCreamRecommendation {
    // TODO 1: declare a HashMap to store the permitted flavours
    // Do not initialize it here
    private HashMap<String, Integer> permittedFlavours;
    // Declare a HashMap to store the sales of different flavours
    // Do not initialize it here. We will initialize it later in the constructor
    private HashMap<String, Integer> flavourSales;
    private List<Map.Entry<String, Integer>> sortedSales;

    // Initialize the collection for permitted flavours with 5 flavours like Vanilla,
    // Strawberry, Chocolate, .....
    // permitted flavours collection and set age limits
    // Age Range: 1- 20
    // Age Range: 21-30
    // Age Range: 30-50
    // Age Range: 50-60
    // Age Range: 60+
    // The age range is passed as a parameter to the method to recommend a flavour
    // based on age passed.
    // If the age is not within the range, the method should return "Invalid Age".
    // The method should return the preferred flavour based on the age passed.
    // The method should not modify the collection.
    public IceCreamRecommendation() {
        permittedFlavours = new HashMap<>();
        flavourSales = new HashMap<>();
        sortedSales = new ArrayList<>();
        permittedFlavours.put("Vanilla", 0);
        permittedFlavours.put("Strawberry", 0);
        permittedFlavours.put("Chocolate", 0);
        permittedFlavours.put("Pistachio", 0);
        permittedFlavours.put("Butterscotch", 0);
    }

    public String recommendByAge(int age) {
        if (age >= 1 && age <= 20) {
            return "Chocolate";
        } else if (age >= 21 && age <= 30) {
            return "Strawberry";
        } else if (age >= 31 && age <= 50) {
            return "Vanilla";
        } else if (age >= 51 && age <= 60) {
            return "Butterscotch";
        } else if (age > 60) {
            return "Pistachio";
        } else {
            return "Invalid Age";
        }
    }

    // Create a method to add data for a sale with flavour and number of items sold
    // The method should add the data to the collection
    // The method should also sort the collection in descending order by the number of sales
    // The method should not modify the collection if the flavour is not permitted
    public void addSale(String flavour, int numberOfItems) {
        if (permittedFlavours.containsKey(flavour)) {
            flavourSales.put(flavour, flavourSales.getOrDefault(flavour, 0) + numberOfItems);
            sortedSales = new ArrayList<>(flavourSales.entrySet());
            sortedSales.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        }
    }

    // Create a method to extract the top three flavours from the items in the collection
    // and return them as an array of strings.
    // The method should return an array of strings with the top three flavours.
    // If there are less than three flavours, the method should return all the flavours.
    // The method should also sort the collection in descending order by the number of sales.
    // The method should not modify the collection.
    public String[] getTopThreeFlavours() {
        int size = Math.min(3, sortedSales.size());
        String[] topFlavours = new String[size];
        for (int i = 0; i < size; i++) {
            topFlavours[i] = sortedSales.get(i).getKey();
        }
        return topFlavours;
    }

    // Create a method to list all the sales in the collection
    // The method should print the sales in the collection
    // The method should not modify the collection.
    public void listAllSales() {
        System.out.println("Ice Cream Sales:");
        for (Map.Entry<String, Integer> entry : sortedSales) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public String[] getPermittedFlavours() {
        return permittedFlavours.keySet().toArray(new String[0]);
    }
}
