import java.util.Scanner;

public class Q2 {


public static void main (String args[]) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    
    double first= input.nextDouble();
    double second= input.nextDouble();
    double third= input.nextDouble();

    double sum= first+second+third;
    double avg= sum/3;

    System.out.println("The average of "+ first +" "+ second + " "+ third + " is "+avg );




}


}
