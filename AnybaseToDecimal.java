import java.util.*;
  
class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int p=0, num=0, rem=0, d=0;

      while(n!=0)
      {
         rem=n%10;
         n=n/10;
         d=(int)Math.pow(b,p);
         p++;
         num=rem*d+num;
      }
      return num;
   }
  }