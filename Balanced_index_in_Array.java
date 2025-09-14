import java.util.Scanner;
//Sample Input 0
//      7
//     -7 1 5 2 -4 3 0
//Sample Output 0
//      3
public class Balanced_index_in_Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=0,end=n-1;
        int count_f=0,count_e=0,i=0;
        while(start!=end){

            count_f+=arr[start];
            count_e+=arr[end];
            start++;
            end--;
            i++;
        }
        System.out.println(i-1);
    }
}
