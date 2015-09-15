package lab03_b_while;
import java.util.*;

public class Lab03_B_While {
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
    
    while (count <= secondNumber){
        System.out.println(count);
        count = count + 2;
        }
    
    System.out.println("Sum of all even numbers between " + firstNumber + " and " + secondNumber + " inclusive are:");
    if (firstNumber%2 == 0){
            count = firstNumber;
        }
        else{
            count = firstNumber + 1;
        }
    
    while (count <= secondNumber){
        total = total + count;
        count = count + 2;
    }
    System.out.println(total);
     
    }
    
}
