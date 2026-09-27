import java.lang.reflect.Constructor;

public class DeliveryPizza extends Pizza{
    //New variables
    private int deliveryFee;
    private String deliveryAddress;

    //Constructor
    public DeliveryPizza(String[] toppings, int numberOfToppings, String deliveryAddress){
        super(toppings, numberOfToppings);
        this.deliveryAddress = deliveryAddress;

        //Calculate the price with the delivery fee
        if(getPrice() > 18)
            deliveryFee = 3;
        else
            deliveryFee = 5;
    }

    //Override for toString()
    public String toString(){
        return super.toString() + "\nDelivery fee: $" + deliveryFee +
                "\nDelivery Address: " + deliveryAddress +
                "\nTotal Price: $" + (getPrice() + deliveryFee);
    }
}
