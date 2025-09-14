import java.util.*;
public class game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        List<Integer> nums=new ArrayList<>();
        while(nums.size()!=5){
            int val=rand.nextInt(10);
            if(!nums.contains(val)){
                nums.add(val);
            }
        }
        System.out.println("Hiii Welcome to the game");
        System.out.println("Enter your Name");
        String name1=sc.next();
        System.out.println("Enter your Name");
        String name2=sc.next();
        System.out.println("Hloo "+name1+" and "+name2);
        List<Integer> player1=new ArrayList<>();
        List<Integer> player2=new ArrayList<>();
        List<Integer> all=new ArrayList<>();
        int score_1=0,score_2=0;
        for(int i=0;i<3;i++){
            System.out.println("Enter the number "+name1);
            int c1=sc.nextInt();

            if(nums.contains(c1)) {
                while (true) {
                    if (!player1.contains(c1) ||  !player2.contains(c1)) {
                        System.out.println("CORRECT");


                        score_1++;
                        break;
                    } else {
                        System.out.println("Invail........ENTER another value");
                        c1=sc.nextInt();
                    }
                }
            }
            else{
                System.out.println("INCORRECT");
            }
            System.out.println("Enter the number "+name2);
            int c2=sc.nextInt();
            player2.add(c2);
            if(nums.contains(c2)) {
                while (true) {
                    if (!player1.contains(c2) ||  !player2.contains(c2)) {
                        System.out.println("CORRECT");


                        score_1++;
                        break;
                    } else {
                        System.out.println("Invalid...ENTER another number");
                        c2=sc.nextInt();
                    }

                }
            }
            else{
                System.out.println("INCORRECT");
            }

        }
        System.out.println("_____________________RESULT_____________________");
        System.out.println("computer numbers"+nums);
        System.out.println("player 1 nums "+player1+" player 2 nums "+player2);
        System.out.println("score of player 1"+score_1+"score of player 2"+score_2);

        if(score_1>score_2){
            System.out.println("Player 1 wins");
        }
        else if(score_1<score_2){
            System.out.println("Player 2 wins");
        }
        else{
            System.out.println("Draw");
        }


    }
}
