import java.util.Scanner;

public class BodyMassIndex{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("enter your weight: ");
        Float weight=input.nextFloat();
        System.out.println("Enter your height: ");
        Float height=input.nextFloat();

        Float BMI=weight/(height*height);


        if (BMI<18.50) {
            System.out.println("Underweight");
        } 
        
        else if(BMI>18.50 && BMI <=24.99){
            System.out.println("Normal Range");
            
        }
        else if (BMI>=25 && BMI<=29.99) {
            System.out.println("Overweight");
            
        }
        else{
            System.out.println("Obese");
        }





    }
}