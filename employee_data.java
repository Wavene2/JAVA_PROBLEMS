import java.util.Scanner;

class Company{
    static String companyName="WAVENE2";
    static int company_profit=10000000;
    static int indian_percent=10;

    String name;
    int age;
    int salary;
    int share_percent;
    int tax_to_pay;
    int profit_percentage;
    Company(String name,int age,int salary,int share_percent){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.share_percent=share_percent;
        this.tax_to_pay=tax_to_pay();
        this.profit_percentage=profit_percentage();
    }
    int tax_to_pay(){
        tax_to_pay=(salary*share_percent)/100;
        return tax_to_pay;
    }
    int profit_percentage(){
        profit_percentage=(company_profit*share_percent)/100;
        return profit_percentage;
    }
    void display(){

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Share percent:"+share_percent);
        System.out.println("Tax to pay:"+tax_to_pay);
        System.out.println("Profit percentage:"+profit_percentage);
    }
}
public class employee_data {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello Everyone This is From WAVENe2\nNo of Employee Data:");
        int n=sc.nextInt();
        Company[] company=new  Company[n];

        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.println("Enter NAME:"+(i+1));
            String name=sc.nextLine();
            System.out.println("Enter AGE:"+(i+1));
            int age=sc.nextInt();
            System.out.println("Enter SALARY:"+(i+1));
            int salary=sc.nextInt();
            System.out.println("Enter SHARE_PERCENT:"+(i+1));
            int share_percent=sc.nextInt();

            company[i]=new Company(name,age,salary,share_percent);
        }
        System.out.println("----------------result of WAVENE2---------------------");
        for(int i=0;i<n;i++){

            company[i].display();
            System.out.println("-------------------------------------");
        }
    }
}
