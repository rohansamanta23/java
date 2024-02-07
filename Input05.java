import java.util.Scanner;
public class Input05 {
    public static void main(String[] args) {
        String str = new String("rohan");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i*2);
        }
    }
}
