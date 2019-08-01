public class even{
  public static void main(String args[]){
      int x=0;
      int total=0;

      for (int i=0;i<30;i++){
          if(i%2==0){
              System.out.println(i);
              x+=1;
              total +=i;
          }
      }
      System.out.println("The Numbers are " + x);
      System.out.println("The total is " + total);
      int average =total/x;
      System.out.println("The average is "+ average);

  }



}