import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        //Variables
        Scanner input = new Scanner(System.in);
        String[] toppings = new String[10];
        int numberOfToppings = 0;
        final String DONE = "DONE";

        //Get toppings from the customers
        System.out.println("Enter up to 10 toppings. Type 'DONE' when ready to checkout.");
        while(numberOfToppings < 10){
            System.out.print("Enter Topping: ");
            String topping = input.nextLine();
            if (topping.equalsIgnoreCase(DONE))
                break;
            toppings[numberOfToppings] = topping;
            numberOfToppings++;
        }

        //Get the Delivery Status
        System.out.print("Is this for delivery? (yes/no): ");
        String deliveryResponse = input.nextLine();

        //Handle Delivery
        if (deliveryResponse.equalsIgnoreCase("yes")){
           //Get the delivery address
           System.out.print("Enter the delivery address: ");
           String deliveryAddress = input.nextLine();

           //Call the delivery pizza constructor
            DeliveryPizza deliveryPizza = new DeliveryPizza(toppings, numberOfToppings, deliveryAddress);
            System.out.println(deliveryAddress);
        } else {
            Pizza pizza = new Pizza(toppings, numberOfToppings);
            System.out.println(pizza);
        }

        //Close the Scanner
        input.close();
    }
}