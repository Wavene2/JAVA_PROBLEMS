import java.util.Scanner;

//Sample Input 0
//
//Version1 1.0.0
//Version2 1.0.0
//Sample Output 0
//
//not changed
public class version_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1[] = sc.nextLine().split(" ");
        String s2[] = sc.nextLine().split(" ");

        String s_1[]=s1[1].split("");
        String s_2[]=s2[1].split("");
//        int s_2=Integer.parseInt(s2[1]);
        int count=0;
//        System.out.println(s_1+" "+s_2);
        for(int i=0;i<s_1.length;i=i+2){

            int val1=Integer.parseInt(s_1[i]);
            int val2=Integer.parseInt(s_2[i]);
            if(val1==val2){
                count=count+0;
            }
            else if(val1<val2){
                count=count+1;
            }
            else if(val1>val2){
                count=count-1;
            }

        }
        if(count==0){
            System.out.println("not changed");
        }
        else if(count>0){
            System.out.println("print upgraded");
        }
        else if(count<0){
            System.out.println("print downgraded");
        }

    }
}
