import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split("");
        int n = s.length, arr[] = new int[n];
        int cout[] = new int[100];
        int num[] = new int[100];
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(s[i]);
            arr[i] = val;
        }
        for(int i=0;i<n;i++){
//            num[i] = arr[i];
            for(int j=0;j<n;j++) {
                if (arr[i] == num[j]) {
                    break;
                }
                else num[i] = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }

    }
}
