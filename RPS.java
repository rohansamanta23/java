import java.util.*;
//import java.util.Random;
public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        int rdm = rc.nextInt(3)+1;
        System.out.println(rdm);
        System.out.println("1 for ROCK");
        System.out.println("2 for PAPER");
        System.out.println("3 for SCISSOR");
        System.out.print("Enter your choice:");
        int userAns = sc.nextInt(4);
        int compAns = (int) ((Math.random()*3)+1);
        if(compAns==1){
            System.out.println("Computer selected ROCK");
        }else if(compAns==2){
            System.out.println("Computer selected PAPER");
        }else if(compAns==3){
            System.out.println("Computer selected SCISSOR");
        }
        if(compAns==userAns){
            System.out.println("Its a draw");
        }else if((compAns==1&&userAns==2)||(compAns==2&&userAns==3)||(compAns==3&&userAns==1)){
            System.out.println("you win");
        }else{
            System.out.println("you loss");
        }
    }
}
//compAns==1&&userAns==2 user
//compAns==1&&userAns==3 comp
//compAns==2&&userAns==1 comp
//compAns==2&&userAns==3 user
//compAns==3&&userAns==1 user
//compAns==3&&userAns==2 comp