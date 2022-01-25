import java.util.Scanner;

public class Q1 {
    
    public static void main (String args[])
    {
         final double pi = 3.14159; 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        float radius = input.nextFloat();

        double area= radius*radius*pi;

        System.out.println("The area for the circle of radius "+radius+" is "+ area);

        


    }


}
