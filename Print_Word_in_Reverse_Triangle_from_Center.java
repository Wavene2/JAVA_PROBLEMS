//import java.util.Scanner;
//
//public class Print_Word_in_Reverse_Triangle_from_Center {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine().toUpperCase();
//        int n=str.length()/2;
//        int k=0;
//        String[] arr=new String[str.length()];
//        for(int f=0;f<str.length();f++){
//            for(int i=0;i<str.length();i++){
//                for(int j=0;j<str.length();j++){
//                    if(n>str.length()){
//                        n=0;
//                    }
//                    if(i+j==str.length()-1){
//                        System.out.print(str.charAt(n));
//                    }
//                    else if(i+j==str.length()+k){
//                        System.out.print(str.charAt(n));


////                    n++;
////                    k++;
////                    if(n>str.length()){
////                        n=0;
////                    }
//                    }
//                    else{
//                        System.out.print(" ");
//                    }
//                }
//
//                System.out.println();
//            }
//            k++;
//        }
//        System.out.println(k);
//
//    }
//}

import java.util.Scanner;
public class Print_Word_in_Reverse_Triangle_from_Center {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        char[] arr = new char[str.length()];
        int n = (str.length()) / 2;
        char new_arr[][] = new char[str.length()][str.length()];
//        System.out.println(n);
        int m = n+1 ;
        int i1 = 0;
        while (i1 < str.length()) {
            if (m >= str.length()) {
                m = 0;
            }
            arr[i1] = str.charAt(m);
            m++;
            i1++;
        }

//        for(int j=0;j<str.length();j++){
//            System.out.print(arr[j]);
//        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
//                System.out.print("*");
                if (i==0) {
                    new_arr[i][j] = arr[j];
                }
                else if (j==str.length()-1) {
                    new_arr[i][j] = new_arr[i-1][0];
                }
                else{
                    new_arr[i][j] = new_arr[i-1][j+1];
                }
//            System.out.println();
            }

        }
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=str.length()-i-1;j++){
                System.out.print(new_arr[i][j]);
            }
            for(int j=0;j<str.length()-i-1;j++){}
//            for(int j=0;j<str.length();j++){
//                System.out.print(new_arr[i][j]);
//            }
            System.out.println();
        }

    }
}