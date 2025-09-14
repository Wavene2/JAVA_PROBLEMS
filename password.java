import java.util.Scanner;

public class password{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        int str_len=password.length();
//        char spl_c[]={'!','@',' ','#','$','%','^','&','*'};
        int spl=0,upper_count=0,lower_count=0,number_count=0,special_count=0;
        for(int i=0;i<str_len;i++){
            if(password.charAt(i)>='A' && password.charAt(i)<='Z'){
                upper_count++;
            } else if (password.charAt(i)>='a' && password.charAt(i)<='z') {
                lower_count++;
            }else if (password.charAt(i)>='0' && password.charAt(i)<='9') {
                number_count++;
            }else{
                special_count++;
            }
        }
//        for(int i=0;i<str_len;i++){
//            for(int j=0;j<spl_c.length;j++){
//                if(password.charAt(i)==spl_c[j]){
//                    special_count++;
//                    break;
//                }
//            }
//        }
        if(lower_count>0 && upper_count>0 && number_count>0 && special_count>0 && str_len>=8){
            System.out.println("Strong password");
        }
        else{
            System.out.println("Week password");
        }
//        System.out.println(lower_count+" "+upper_count+" "+number_count+" "+special_count);
    }
}
