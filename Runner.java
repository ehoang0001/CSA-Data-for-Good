public class Runner {
    public static void main(String[] args) {
       

        // Create an instance of RestaurantChain
        RestaurantChain chain = new RestaurantChain("locations.txt", "monthly_sales.txt", "customer_ratings.txt", "operating_costs.txt");

        // Print details
        System.out.println(chain.toString());
    }
}