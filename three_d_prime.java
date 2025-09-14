public class three_d_prime {
    public static boolean Prime(int n){
        int count=0;
        for(int a0=2;a0<n;a0++){
            if(n%a0==0)
                count++;
        }
        if(count==0){
            return true;
        }
        else return false;
    }
    public static boolean sum_of_prime(int n){
        int sum=0;
        for(int i=0;i<3;i++){
            sum=sum+(n%10);
            n=n/10;
        }
        return Prime(sum);
    }
    public static boolean Digit_primt(int a){
        int count=0;
        for(int i=0;i<3;i++){
            int num=a%10;
            a=a/10;
            if(num>1){
            if(Prime(num)){
                count++;
            }}
            else{
                return false;
            }
        }
        if(count==3){
            return true;
        }
        else return false;


    }
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            if(Prime(i) && sum_of_prime(i) && Digit_primt(i)){
                System.out.println(i);
            }
        }
    }
}


