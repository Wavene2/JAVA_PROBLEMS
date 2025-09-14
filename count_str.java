import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class count_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[]= sc.nextLine().split(" ");
        ArrayList<String> list=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        ArrayList<Integer> set1=new ArrayList<>();
        int count=0;
        for(int i=0;i<str.length;i++){
            list.add(str[i]);
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){

                 if(list.get(i).equals(list.get(j))){
                    count++;
                    set.add(list.get(j));
                }
            }
            set1.add(count);
            count=0;
        }
        System.out.println(set);
        System.out.println(set1);
    }
}
