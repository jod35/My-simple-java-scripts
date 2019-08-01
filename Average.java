import java.util.Scanner;
public class Average{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int x =0;
        int n=0;
        int total=0;
        String name;
        int age;
        
        while(x<2){
             x+=1;
            System.out.println("Enter name ");
            name=input.next();

            System.out.println("Enter age: ");
            age=input.nextInt();
            
            total+=age;
            n+=1;
            

            if (x==2) {
                int average= total/n;
                System.out.println("The average is " + average);
                break;

            }
        }


    }
}
