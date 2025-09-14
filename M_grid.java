public class M_grid {
    public static void main(String[] args) {
        int grid[][]=new int[10][10];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(j==0||j==9){
                    System.out.print("|");
                }
                else if((i==j && i<5)){
                    System.out.print("|");
                }
                else if((i+j==8 && i<5)){
                    System.out.print("|");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
