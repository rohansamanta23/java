import java.util.Scanner;
public class string14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String str = sc.nextLine();
        String strLwr = str.toLowerCase();
        String strUpr = str.toUpperCase();
        System.out.println("your name in lower case:"+strLwr);
        System.out.println("&");
        System.out.println("your name in Upper case:"+strUpr);
        String strLine = str.replace(" ","_");
        System.out.println("And your name with underscore is:" + strLine);
        String letter = "Dear name, Thanks a lot.";
        int num = str.indexOf(" ");
        String onlyName = str.substring(0,num);
        letter = letter.replace("name",onlyName);
        System.out.println(letter);
        int doubleSpace = str.indexOf("  ");
        int tripleSpace = str.indexOf("   ");

        if(tripleSpace>-1){
            str = str.replace("   "," ");
        }
        if(doubleSpace>-1) {
            str = str.replace("  "," ");
        }

        System.out.println(str);
    }
}
