import java.util.Scanner;

public class Subarray_16_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int n1=sc.nextInt();
        int maxis[]=new int[n-(n1-1)];
        for(int i=0;i<n-(n1-1);i++){
            int max=0;
            for(int j=i;j<n1+i;j++){
                if(max<arr[j]){
                    max=arr[j];
                }
            }
            maxis[i]=max;
        }
        for(int i=0;i<n-(n1-1);i++){
            System.out.print(maxis[i]+" ");
        }
    }
}
