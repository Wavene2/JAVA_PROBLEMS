import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPL_SHEDULE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF TEAMS");
        int n=sc.nextInt();
        String Team_List[]=new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("ENTER THE TEAM"+(i+1)+"NAME");
            Team_List[i]=sc.nextLine();
        }
        int m=sc.nextInt();
        ArrayList<String[]> matches=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                for(int k=0;k<m;k++){
                    matches.add(new String[]{Team_List[i],Team_List[j]});
                }
            }
        }
        int index=1;
        for(String[] i:matches){
            System.out.println("Match no "+index+": "+i[0]+" VS "+i[1]);
            index++;
        }
    }
}
