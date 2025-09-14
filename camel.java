import java.util.Scanner;

public class camel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char chat[]=str.toCharArray();
        for(int i=0;i<chat.length;i++){
            if(i==0){
                if(chat[i]>='a'&&chat[i]<='z'){
                    chat[i]=(char)(chat[i]-32);
                }
            }
            if(chat[i]==' '){
                chat[i+1]=(char)(chat[i+1]-32);
            }
        }
        for(int i=0;i<chat.length;i++){
            if(chat[i]!=' '){
                System.out.print(chat[i]);
            }

        }


    }
}
