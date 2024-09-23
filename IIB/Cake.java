package IIB;

public class Cake {
    public String shape; // shape of the cake
    public int price; // price of the cake
    public static int counter =500; // counter for unique value assignment ie to automatically update the value of the price without having to do it manually

    //Instance Initialization Block to initialize the price of the cake

    {
        price = counter;
        counter+=500;
    }

    //Constructor to initialize the shape of the cake
    public Cake(String shape){
        this.shape = shape;
    }

    //getter methods
    public int getPrice(){
        return price;
    }
    public String getShape(){
        return shape;
    }

    //main method to ensure that the methods are executed correctly.
    public static void main(String[]args){
       Cake cake = new Cake("Pie");
       Cake cake1 = new Cake("Cookie");
       Cake cake2 = new Cake("Muffin");
       Cake cake3 = new Cake("Pancake");
       System.out.println("Cake: price = " + cake.getPrice() + ", Shape = " + cake.getShape());
        System.out.println("Cake: price = " + cake1.getPrice() + ", Shape = " + cake1.getShape());
        System.out.println("Cake: price = " + cake2.getPrice() + ", Shape = " + cake2.getShape());
        System.out.println("Cake: price = " + cake3.getPrice() + ", Shape = " + cake3.getShape());

    }
}
