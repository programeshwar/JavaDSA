import java.util.*;
  
  class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       int r1=0, r2=0, num=0, rem=0, qou=0, power=1, borrow=0;

       while (n2!=0)
       {
           r1=n1%10;
           r2=n2%10;

           n1/=10;
           n2/=10;

           int diff = r2-r1-borrow;

           if(diff<0)
           {
               borrow=1;
               diff+=b;
           }
           else
           {
               borrow=0;
           }

           num+=diff*power;
           power*=10;
       }
       return num;
  
  }
  }