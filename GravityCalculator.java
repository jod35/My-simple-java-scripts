import java.util.Scanner;
public class GravityCalculator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double gravity=-9.81;
        double initialvelocity=0.0;
        double falling_time=10.0;
        double initialposition=0.0;
        double finalposition=0.0;
        System.out.println("the object's position after " + falling_time + "s is" + finalposition +"m");
        // the object's position after 10.0s is0.0m


        System.out.println("enter initial position: ");
        initialposition=input.nextDouble();
        
        System.out.println("enter initial velocity: ");
        initialvelocity=input.nextDouble();

        System.out.println("enter time: ");
        falling_time=input.nextDouble();

        finalposition=0.5*(gravity*(falling_time*falling_time))+(initialvelocity *falling_time) +initialposition; 

        System.out.println("the object's position after " + falling_time + "s is " + finalposition +"m");
         

    }
}