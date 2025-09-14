import java.util.Scanner;

public class Pathfinding_in_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int i=0;
        int j=0;

        boolean flag=true;
        while(flag){
            if(j==(n-1) && i==(n-1) && arr[i][j]==1){

                    flag=true;
                    break;


            }
            if(arr[i][j]==1){
//                if(j!=n-1 && (arr[i][j+1]==1 || arr[i+1][j]==1) ){
//                    flag=true;

                    if(j+1<n&&arr[i][j+1]==1){

                        j=j+1;
                    }
                    else if(i+1<n&&arr[i+1][j]==1){
                        i=i+1;

                    }
                    else {
                        flag=false;
                        break;
                    }
                }





            else{
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
//||(i==n-1&&j==n-1&&arr[i][j]==1)