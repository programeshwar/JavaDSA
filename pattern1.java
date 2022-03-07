import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1, nsp = 0;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=nst; j++)
            {
                System.out.print("*\t");
            }

            System.out.println();
            nst++;
        }



        // write ur code here

    }
}