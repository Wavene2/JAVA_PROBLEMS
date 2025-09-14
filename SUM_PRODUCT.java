import java.io.*;
import java.util.*;

public class SUM_PRODUCT {
    public static int count(int temp){
        int c=0;
        while(temp!=0){
            temp=temp/10;
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];


//        System.out.print(c);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int prod=1;
        int sum=0;
        for(int i=0;i<n;i++){
            int temp=arr[i];
            int c=count(temp);
            for(int j=0;j<c;j++){
                sum=sum+(temp%10);
                prod=prod*(temp%10);
                temp=temp/10;
            }
            int max=(sum<prod)?prod:sum;
            System.out.print(max+" ");
            sum=0;
            prod=1;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}