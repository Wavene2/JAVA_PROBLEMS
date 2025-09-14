import java.util.Scanner;

public class length_last_word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int count=0;
        for(int i=str.length()-1;i>0;i--)
        {
            if(str.charAt(i)==' ' && count==0)
            {
                continue;
            }
            else
            {
                if(str.charAt(i)!=' ')
                {
                    count++;
                }
                else
                {
                    break;
                }

            }
        }
        System.out.println(count);
    }
}
