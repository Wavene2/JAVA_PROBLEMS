import java.util.Scanner;

public class Subarray_of_size_k_with_given_sum_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int times=sc.nextInt();
        int su=sc.nextInt();
        int sum=0;
        for(int i=0;i<n-(times-1);i++){

            for(int j=i;j<times+i;j++){
                sum+=arr[j];
            }
            if(sum==su){
                break;
            }
            sum=0;

        }
        if(sum==su){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
