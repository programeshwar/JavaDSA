import java.util.*;

class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     int ans=0, power=1; 

     while(n2!=0)
     {
        int d=n2%10;
        n2/=10;
        int pars = gpwsd(n1,d,b);
        ans=aba(pars*power, ans, b);
        power*=10;
     }
     return ans;

}

public static int gpwsd(int n1, int d, int b){
    int ans=0, pow=1, carry1=0;
    while(n1!=0 || carry1!=0 )
        {
            int ld=n1%10;
            n1/=10;

            int product = ld*d+carry1;

            int rem = product%b;
            int quo = product/b;
            
            ans+=rem*pow;

            pow*=10;
            carry1=quo;
        }
        return ans;
}

public static int aba(int n1, int n2, int b)
{
    int ans=0, pow=1,sum=0 , carry=0;

    while(n2!=0 || n1!=0 || carry!=0)
    {
        int ld1=n1%10;
        int ld2=n2%10;

        n1/=10;
        n2/=10;

        sum = ld1+ld2+carry;

        int rem=sum%b;
        int qou=sum/b;

        ans+=rem*pow;
        pow*=10;
        carry=qou;
    }
    return ans;
}
}