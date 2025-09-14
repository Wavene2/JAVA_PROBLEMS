import java.util.Scanner;

public class Co_prime {
    public static boolean cop(int a,int b){
        return gcd(a,b)==1;
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=5;i<=n;i++)
        {
            for(int j=4;j<=i;j++)
            {
                for (int k = 3; k <= j; k++)
                {
                    if((k*k)+(j*j)==(i*i) && cop(i,j) && cop(j,k) && cop(i,k))
                    {
                        System.out.println(i+","+j+","+k);
                    }
                }
            }
        }
    }
}
