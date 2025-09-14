import java.util.Scanner;

public class Alternate_Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int o_count=0,e_count=0,even_count=str.length()/2,odd_count=str.length()-even_count;
        char ch1=str.charAt(0),ch2=str.charAt(1);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch1){
                o_count++;
            }
            else if(str.charAt(i)==ch2){
                e_count++;
            }
        }
//        System.out.println(e_count+" "+o_count+" "+even_count+" "+odd_count);
        if((o_count==odd_count)&&(e_count==even_count)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
