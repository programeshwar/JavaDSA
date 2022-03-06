import java.io.*;
import java.util.*;

class Main{

public static int arrIndex(int arr[],int d){
    int index=-1;
    for(int i=0; i<arr.length; i++){
        
        if(arr[i]==d){
            index = i;
            break;
        }
    }

    return index;
}


public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n= scn.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }

    int d=scn.nextInt();

    int result = arrIndex(arr,d);
    System.out.println(result);

 }

}git 