import java.util.Scanner;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int j=0;j<n;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        int star=0;
        for(int i=0;i<n;i++){
            if(arr[i]==min){
                star=i;
                break;
            }
        }
        int new_arr[]=new int[n-star];
        for(int i=0;i<n-star;i++){
            new_arr[i]=arr[i+star];
        }
        int max=0;
        for(int i=0;i<new_arr.length;i++){
            if(new_arr[i]>max){
                max=new_arr[i];
            }
        }
        System.out.println(max-min);
    }
}
