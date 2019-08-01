public class odd{
    public static void main (String args[]){
        int x =0;
        int total=0;
        
        for (int i=1;i<30;i++){
            if(i%2==1){
                x+=1;
                total+=i;
                System.out.println(i);
            }
        }
        System.out.println("the numbers are " + x);
        System.out.println("the total of the numbers is " + total);
        int average = total/x;
        System.out.println("the mean is  " + average);

    }
}