import java.util.Scanner;

public class cow_leg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leg=sc.nextInt();
        int head=sc.nextInt();
        if(leg%2==0 && leg>head){
            int c=0;
            int h=head;
            while(true){
                int c_leg=c*4;
                int h_leg=h*2;
                if(c_leg+h_leg==leg){
                    break;
                }
                c++;
                h--;
            }
            System.out.println(c+" "+h);
        }
        else{
            System.out.println("no");
        }


    }
}
