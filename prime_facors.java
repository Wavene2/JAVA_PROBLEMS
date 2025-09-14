import java.util.Scanner;

public class prime_facors {
    public static void pri_fac(int a,int num){
        if(num==1){
            return;
        }
        while(num%a!=0){
            a=a+1;
        }
        System.out.println(a+" ");
        pri_fac(a,num/a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pri_fac(2,n);
    }
}
