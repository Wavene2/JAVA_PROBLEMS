import java.util.Scanner;

public class String_Matrix_Creation_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        int n1;
        // if(str.length()%2==0){
        //     n1=(str.length())/2;
        // }
        // else{
        n1=str.length()-n;
        // }
        // System.out.print(n1);
        char arr[][]=new char[n1][n];
        int k=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n;j++){
                if(str.length()>k){
                    arr[i][j]=str.charAt(k++);
                }
                else{

                    arr[i][j]='-';

                }
            }
        }
        int t=1;
        for(int i=0;i<n1;i++){
            for (int j=0;j<n;j++){
                if(t>(str.length()+n-1)){
                    break;
                }
                else{
                System.out.print(arr[i][j]+" ");
                t++;
                }
            }
            System.out.println();
        }
    }
}
