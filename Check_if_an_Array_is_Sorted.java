import java.util.Scanner;

public class Check_if_an_Array_is_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j =0; j < n-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (arr2[i] == arr[i]) {
                count++;
            }
        }
        if(count==n){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
