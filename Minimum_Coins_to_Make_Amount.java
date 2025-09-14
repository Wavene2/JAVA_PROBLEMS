import java.util.Scanner;

public class Minimum_Coins_to_Make_Amount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int coins=0;
        int coin_count=0;
        for(int i=0;i<n;i++){
            while(true){
                if (total == coins){
                    break;
                }
                if (total < coins){
                    coin_count--;
                    coins-=arr[i];
                    break;
                }
                else{
                    coins+=arr[i];
                    coin_count++;
                }
            }
        }
        System.out.println(coin_count);
    }
}
