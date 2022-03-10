import java.util.*;
    
class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int count=0;

      int tmp = n;

      while(tmp!=0)
      {
        tmp=tmp/10;
        count++;
      }

      int node = count;

      int div =(int)Math.pow(10,node-1);
      int q=0;
      while(div!=0)
      {
        q=n/div;
        System.out.println(q);

        n=n%div;    //remainder
        div=div/10;
      } 
    
     }
    }