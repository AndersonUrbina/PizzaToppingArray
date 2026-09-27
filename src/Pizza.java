public class Pizza {
    //Variables
    private String[] toppings;
    private String description;
    private int price;
    private int numberOfToppings;
    private int pizzaPrice = 14;
    private int toppingPrice = 2;


    //Constructor
    public Pizza(String[] toppings, int numberOfToppings){
        //Set Pizza values
        this.toppings = toppings;
        this.numberOfToppings = numberOfToppings;
        this.description = "";

        //Build the description
        for(int i = 0; i < numberOfToppings; i++){
            description += toppings[i];
            if(i < numberOfToppings - 1){
                description += ", ";
            }
        }

        //Calculate the price
        this.price = pizzaPrice + (numberOfToppings + toppingPrice);
    }

    //Accessor Method for Price
    public double getPrice(){
        return price;
    }

    //tostring override, tostring is called when yuo print an object
    @Override
    public String toString(){
        return "You ordered a Pizza with the following Toppings: " + description + "\n Price: $" + price;
    }
}