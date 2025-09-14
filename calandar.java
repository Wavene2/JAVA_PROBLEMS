public class calandar {
    public static void main(String[] args) {
        String[][] cal=new String[5][7];
        cal[0][0]="SUN";
        cal[0][1]="MON";
        cal[0][2]="TUE";
        cal[0][3]="WEN";
        cal[0][4]="THU";
        cal[0][5]="FRI";
        cal[0][6]="SAT";
        int k=0;

        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++) {
                if(k==31){
                    break;
                }
                if(i==0){
                    System.out.print(cal[i][j]+" ");
                }
                if(i>0 && i<6) {
                    if(k!=0) {
                        System.out.print(String.valueOf(k) + " ");
                    }
                    k++;
                }
            }
            System.out.println();
        }
    }
}