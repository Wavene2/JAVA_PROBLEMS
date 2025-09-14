import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Track_Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n=sc.nextInt();
        char arr[]=new char[n];
        String s=sc.next().toUpperCase();
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i);
        }
        for(int j=0;j<n;j++){
            if(s.charAt(j)=='U'){
                y++;
            }
            else if(s.charAt(j)=='D'){
                y--;
            }
            else if(s.charAt(j)=='L'){
                x--;
            }
            else if(s.charAt(j)=='R'){
                x++;
            }
        }
        System.out.println(x+" "+y);

    }
}
