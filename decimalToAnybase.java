import java.util.*;
  
  class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int num=0, mul=1;

       while(n>0)
       {
           int rem=n%b;
           n=n/b;
        num= num+rem*mul;
        mul*=10;

       }

         return num;

   }
  }