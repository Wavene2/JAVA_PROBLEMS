import java.util.Scanner;

public class Rotating_Number_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int k=1;
//        for(int i=0;i<n;i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0) {
//                    arr[i][j]=k;
//                    k++;
//                }
//                else{
//                    arr[i][j]=0;
//                }
//            }
//        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                System.out.print("*");
                if (i==0) {
                    arr[i][j] = k;
                    k++;
                }
                else if (j==n-1) {
                    arr[i][j] = arr[i-1][0];
                }
                else{
                    arr[i][j] = arr[i-1][j+1];
                }
//            System.out.println();
            }

        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
