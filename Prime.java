import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean count=false;
        System.out.print("Enter the number:");
        num = sc.nextInt();
        if(num<2){
            count=true;
        }else{
            for (int i = 2; i <= (num/2); i++) {
                if(num%i==0){
                    count=true;
                    break;
                }
            }
        }
        if(count){
            System.out.println("NOT a PRIME Number");
        }else{
            System.out.println("PRIME Number");
        }

    }
}
