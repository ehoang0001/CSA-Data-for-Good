import java.util.Arrays;

public class RestaurantChain {

    // Instance Variables to store restaurant data
    private String[] locations;
    private double[] monthlySales;
    private double[] customerRatings;
private double[] operatingCosts;
private double[] profitMargins;

/*
    * No-argument constructor initializes empty arrays for all data fields.
    */
public RestaurantChain() {
    locations = new String[0];
    monthlySales = new double[0];
    customerRatings = new double[0];
    operatingCosts = new double[0];
    profitMargins = new double[0];
}

    /*
     * Parameterized constructor reads data from files and initializes arrays.
     * Automatically calculates profit margins based on sales and costs.
     */
    public RestaurantChain(String locationsFile, String monthlySalesFile, String customerRatingsFile, String operatingCostsFile) {
        locations = FileReader.toStringArray(locationsFile);
        monthlySales = FileReader.toDoubleArray(monthlySalesFile);
        customerRatings = FileReader.toDoubleArray(customerRatingsFile);
operatingCosts = FileReader.toDoubleArray(operatingCostsFile);
this.profitMargins = calculateProfitMargins();
}

/*
* Calculates profit margins for each restaurant location.
* Profit margin is computed as sales minus operating costs.
*/
private double[] calculateProfitMargins() {
double[] margins = new double[locations.length];
for (int i = 0; i < locations.length; i++) {
    margins[i] = monthlySales[i] - operatingCosts[i];
}
return margins;
    }

    /*
    * Finds the location with the highest customer rating.
    * Returns the name of the location with the best rating.
    */
public String findHighestRatedLocation() {
    double maxRating = customerRatings[0];
    int maxIndex = 0; // Initialize to the first location
    for (int i = 0; i < customerRatings.length; i++) {
        if (customerRatings[i] > maxRating) {
            maxRating = customerRatings[i];
            maxIndex = i;
        }
    }
    return locations[maxIndex];
}

    /*
     * Finds the location with the highest profit margin.
     * Returns the name of the most profitable location.
     */
    public String findMostProfitableLocation() {
        double maxProfit = profitMargins[0];
        int maxIndex = 0; // Initialize to the first location
        for (int i = 0; i < profitMargins.length; i++) {
            if (profitMargins[i] > maxProfit) {
                maxProfit = profitMargins[i];
                maxIndex = i;
            }
        }
        return locations[maxIndex];
    }

    /*
     * Finds the location that is both highly rated and profitable.
     * Combines ratings and profit margins to determine the best overall location.
     */
    public String findBestOverallLocation() {
        double bestScore = profitMargins[0] + (customerRatings[0] * 1000.0);
int bestIndex = 0; // Initialize to the first location
for (int i = 0; i < locations.length; i++) {
    double score = profitMargins[i] + (customerRatings[i] * 1000.0);
    if (score > bestScore) {
        bestScore = score;
        bestIndex = i;
    }
        }
        return locations[bestIndex];
    }

    /*
     * Calculates the average monthly sales across all locations.
     * Returns the average sales as a double.
     */
    public double calculateAverageSales() {
        double total = 0;
        for (double sale : monthlySales) {
            total += sale;
        }
        return total / monthlySales.length;
    }

    /*
    * Creates a detailed summary of the restaurant chain's data.
    * Includes locations, customer ratings, profit margins, average sales,
    * highest-rated location, most profitable location, and best overall location.
    */
public String toString() {
    // Build the string for locations and ratings
    String locationsAndRatings = "";
    for (int i = 0; i < locations.length; i++) {
        locationsAndRatings += "Location: " + locations[i] + ", Rating: " + customerRatings[i] + "\n";
    }

    // Build the string for profit margins
    String profitMarginsString = "";
    for (int i = 0; i < profitMargins.length; i++) {
        profitMarginsString += "Location: " + locations[i] + ", Profit Margin: $" + profitMargins[i] + "\n";
    }

    // Return the full formatted string
    return "RestaurantChain Summary:\n" +
            "Locations and Ratings:\n" + locationsAndRatings +
            "Profit Margins:\n" + profitMarginsString +
            "Average Sales: $" + calculateAverageSales() + "\n" +
            "Highest Rated Location: " + findHighestRatedLocation() + "\n" +
            "Most Profitable Location: " + findMostProfitableLocation() + "\n" +
            "Best Overall Location: " + findBestOverallLocation();
}





}