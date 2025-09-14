
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Consecutive_1s_in_a_Binary_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int j=0;j<n;j++){
            if(arr[j]==1){
                count++;
            }
            else if(arr[j]==0 && j!=n && j!=0){
                list.add(count);
                count=0;
            }
        }
        list.add(count);
        int max=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println(max);


    }
}
