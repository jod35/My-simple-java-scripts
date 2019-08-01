import java.util.Scanner;
public class Circlearea{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius=input.nextDouble();
        
        double pi=3.14;

        double area= pi*(radius*radius);

        System.out.println("the area of a circle of radius " + radius +" units is " + area + " square units");
        
    }
}