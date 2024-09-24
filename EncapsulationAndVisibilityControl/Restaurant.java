package EncapsulationAndVisibilityControl;

//this Restaurant class is to show visibility control using different access modifiers and encapsulation using getters and setters
public class Restaurant {

    //the following are different access modifiers

     int foodPrices; // this is default and is only accessible within the same package
    private int ordersTaken; // this is accessible within only the Restaurant class.
    protected String waiterName; // this is accessible within the same package or subclass
    public String foodSold; // this can be accessed anywhere, within or outside the class or even package

    //constructor to initiate the variables

    public Restaurant(int foodPrices, int ordersTaken, String waiterName, String foodSold){
        this.foodPrices = foodPrices;
        this.ordersTaken = ordersTaken;
        this.waiterName = waiterName;
        this.foodSold = foodSold;
    }
//methods to show encapsulation
    //getter method
    public int getOrdersTaken(){
        return ordersTaken;
    }
    //setter method
    public void setOrdersTaken(int ordersTaken) {
        this.ordersTaken = ordersTaken;
    }
    public void showDetails(){
        System.out.println("Food price:" +foodPrices);
        System.out.println("Orders Taken:" +ordersTaken);
        System.out.println("Food price:" +waiterName);
        System.out.println("Food sold:" +foodSold);
    }

    //main method to demonstrate the access modifiers and encapsulation

    public static void main(String[]args){

        // here I have created an object for the Restaurant class
        Restaurant r1 = new Restaurant(25000,1,"Remember Joselyne","Pizza");
        System.out.println("Food price:" +r1.foodPrices);
        System.out.println("Orders Taken:" +r1.ordersTaken);
        System.out.println("Waiter name:" +r1.waiterName);
        System.out.println("Food sold:" +r1.foodSold);
    }
}

