package SIB;

public class Library {
 public String BookAuthor; // instance variable

 static int copiesProduced; // static variable
 static int copiesSold; // static variable

 // Static Block
    static{
        copiesProduced = 10;
        copiesSold = 2;
 }
 //constructor to initialize the instance objects
    public Library(String BookAuthor){
        this.BookAuthor = BookAuthor;
    }
    // constructor to allow increment of the copies sold and decrement of the copies produced

    // getter methods for the static and instance variables
    public int getCopiesProduced(){
        return copiesProduced;
    }
    public int getCopiesSold(){
        return copiesSold;
    }
    public String getBookAuthor(){
        return BookAuthor;
    }
// main method
    public static void main(String[]args){
        Library lib = new Library("Ben Carson");
        System.out.println("The author  is: " + lib.getBookAuthor() );
        System.out.println("The number of initial copies produced: " +Library.copiesProduced);
        System.out.println("The number of copies sold: " +Library.copiesSold);
    }

}

