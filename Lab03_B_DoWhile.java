package java03_b_dowhile;
import java.util.*;

public class Java03_B_DoWhile {
    static Scanner consule = new Scanner(System.in);


    public static void main(String[] args) {
         
    int firstNumber;
    int secondNumber;
    int count;
    int total= 0;
    System.out.println("Input the first number: ");
    firstNumber = consule.nextInt();
    System.out.println("Input the second number: ");
    secondNumber = consule.nextInt();
    
    System.out.println("All the odd numbers between " + firstNumber + " and " + secondNumber + " inclusive are:");
    if (firstNumber%2 == 0){
            count = firstNumber + 1;
        }
        else{
            count = firstNumber;
        }
    do{
        System.out.println(count);
        count = count + 2;
    } while (count <= secondNumber);
    
    System.out.println("Sum of all even numbers between " + firstNumber + " and " + secondNumber + " inclusive are:");
    if (firstNumber%2 == 0){
            count = firstNumber;
        }
        else{
            count = firstNumber + 1;
        }
    
    do {
        total = total + count;
        count = count + 2;
    } while ( count <= secondNumber);
    
    System.out.println(total);
    
    }
    
}
