package lab03_a;
import java.util.*;

public class Lab03_A {
    static Scanner consule = new Scanner(System.in);

    public static void main(String[] args) {
    
        int pages;
        double cost = 0;
        
        System.out.println("Enter the number of pages you want to fax.");
        pages = consule.nextInt();
        if (pages <= 10){
            cost = 3 + .20;
        }
        else if (pages > 10){
            cost = 3.00 + .20 + (.10 * (pages - 10));
        }
        else{
            System.out.println("Please enter a valid number");
        }
        
        System.out.println("That will cost you $" + String.format("%.2f", cost));
        
    }
    
}
