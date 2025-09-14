import java.util.*;
public class str_expand
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split("");
        for(int i=0;i<str.length-1;i=i+2){
            int val=Integer.parseInt(str[i+1]);
            for(int j=0;j<val;j++){
                System.out.print(str[i]);
            }
        }
    }
}
