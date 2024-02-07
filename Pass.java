import java.util.Scanner;
public class Pass {
     static float percentage(float xmNum, int total){
        return (xmNum/total)*100;
    }
    public static void main(String[] args) throws IllegalStateException {
        Scanner sc = new Scanner(System.in);



//        System.out.println("Enter the max number of test:");
//        int max = sc.nextInt();
//        System.out.println("Enter the 1st xm number:");
//        float xm1 = sc.nextFloat();
//        float xm1Per = Pass.percentage(xm1,max);
//        System.out.println("Enter the 2nd xm number:");
//        float xm2 = sc.nextFloat();
//        float xm2Per = Pass.percentage(xm2,max);
//        System.out.println("Enter the 3rd xm number:");
//        float xm3 = sc.nextFloat();
//        float xm3Per = Pass.percentage(xm3,max);
//        if(xm1Per>=33.0){
//            System.out.println("you passed the 1st xm");
//        }else {
//            System.out.println("you failed the 1st xm");
//        }
//
//        if(xm2Per>=33.0){
//            System.out.println("you passed the 2nd xm");
//        }else {
//            System.out.println("you failed the 2nd xm");
//        }
//        if(xm3Per>=33.0){
//            System.out.println("you passed the 3rd xm");
//        }else {
//            System.out.println("you failed the 3rd xm");
//        }
//        int sumMax = 100*3;
//        float sumMarks = xm1 + xm2 + xm3;
//        float per = Pass.percentage(sumMarks,sumMax);
//        if(per>=40){
//            System.out.println("you pass the whole exam");
//        }else{
//            System.out.println("you fail the whole exam");
//        }



//        System.out.print("enter your income:");
//        int salary = sc.nextInt();
//        float tax;
//        if(salary > 1000000){
//            tax = (30/100.0f) * salary;
//        }else if(salary > 500000){
//            tax = (20/100.0f) * salary;
//        }else if(salary > 250000){
//            tax = (5/100.0f) * salary;
//        }else{
//            tax = 0;
//        }
//        System.out.println("your tax will be "+tax+" rs.");


//        System.out.println("Enter the number:");
//        byte week = sc.nextByte();
//        switch(week){
//            case 1 ->
//                System.out.println("today is monday");
//            case 2 ->
//                System.out.println("today is tuesday");
//            case 3 ->
//                System.out.println("today is wednesday");
//            case 4 ->
//                System.out.println("today is thursday");
//            case 5 ->
//                System.out.println("today is friday");
//            case 6 ->
//                System.out.println("today is saturday");
//            case 7 ->
//                System.out.println("today is sunday");
//            default ->
//                System.out.println("Unexpected value");
//        }


//        System.out.print("Enter the year:");
//        int year = sc.nextInt();
//        if(year%400==0){
//            System.out.println("ok");
//        }else{
//            if(year%4==0&&year%100!=0){
//                System.out.println("ok");
//            }else{
//                System.out.println("no");
//            }
//        }


        System.out.print("Enter your website name:");
        String web = sc.next();
        if(web.endsWith(".com")){
            System.out.println("Commercial website");
        }else if(web.endsWith(".org")){
            System.out.println("Organization website");
        }else if(web.endsWith(".in")){
            System.out.println("Indian website");
        }else{
            System.out.println("Unexpected value");
        }
//        int point = web.indexOf(".");
//        String url = web.substring(point+1);
//        switch (url){
//            case "com" -> System.out.println("Commercial website");
//            case "org" -> System.out.println("organization website");
//            case "in" -> System.out.println("indian website");
//            default -> System.out.println("Unexpected value");
//        }
    }
}
