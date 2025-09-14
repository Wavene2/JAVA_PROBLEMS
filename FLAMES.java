import java.util.*;

public class FLAMES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name 1");
        String name1=sc.nextLine();
        System.out.println("Enter name 2");
        String name2=sc.nextLine();
        List<Character> list1=new ArrayList<>();
        List<Character> list2=new ArrayList<>();
        for(char c:name1.toCharArray()){
            list1.add(c);
        }
        for(char c:name2.toCharArray()){
            list2.add(c);
        }

        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i).equals(list2.get(j))){
                    list1.set(i,'0');
                    list2.set(j,'0');
                }
            }
        }
//        System.out.println(list1+" "+list2);
        int count=0;
        for(char c:list1){
            if(c!='0'){
                count++;
            }
        }
        for(char c:list2){
            if(c!='0'){
                count++;
            }
        }
        List<String> ans=new ArrayList<>(Arrays.asList("friend","lover","affection","marriage","enemy"));
        int i=0;
        while(ans.size()!=1){
            i=(i+(count-1))%ans.size();
            ans.remove(i);
        }
        System.out.println(ans);
    }
}
