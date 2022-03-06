import java.io.*;
import java.util.*;

class Main{

    public static void span(int arr[]){
            int max=arr[0];
            for(int i=0;i<arr.length; i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }

            int min=arr[0];
            for(int i=0; i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }

            int result = max-min;
            System.out.println(result);

    }

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();

    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
    }

    span(arr);
// System.out.println(result);
 }

}