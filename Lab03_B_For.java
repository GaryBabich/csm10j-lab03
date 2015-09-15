package java03_b_for;
import java.util.*;

public class Java03_B_For {
    static Scanner consule = new Scanner(System.in);

    public static void main(String[] args) {
         
    int firstNumber;
    int secondNumber;
    int temp;
    int total= 0;
    System.out.println("Input the first number: ");
    firstNumber = consule.nextInt();
    System.out.println("Input the second number: ");
    secondNumber = consule.nextInt();
    
    System.out.println("All the odd numbers between " + firstNumber + " and " + secondNumber + " inclusive are:");
    if (firstNumber%2 == 0){
            temp = firstNumber + 1;
        }
        else{
            temp = firstNumber;
        }
    
    for (int i = temp; i<= secondNumber; i = i + 2){
        System.out.println(i);
        }
    
    System.out.println("Sum of all even numbers between " + firstNumber + " and " + secondNumber + " inclusive are:");
    if (firstNumber%2 == 0){
            temp = firstNumber;
        }
        else{
            temp = firstNumber + 1;
        }
    
    for (int i = temp; i<= secondNumber; i = i + 2){
        total = total + i;
    }
    System.out.println(total);
    
    }
    
}
