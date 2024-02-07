
import java.util.Scanner;
public class Practice_Array {
//    public static void main(String[] args) {
//        float[] ar = {4.3f,5.6f,4.6f,5.6f,10.4f};
//        float sum = 0.0f;
//        for(float ele:ar){
//            sum += ele;
//        }
//        System.out.println("sum="+sum);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean nah=true;
//        int[]arr = {1,2,3,4,5,6,7,8,9};
//        System.out.print("Enter the Element you wanna found:");
//        int ele = sc.nextInt();
//        for (int j : arr) {
//            if (j == ele) {
//                System.out.println("Found it👍");
//                nah = false;
//                break;
//            }
//        }
//        if(nah){
//            System.out.println("Nah couldn't Find😢");
//        }
//    }
//    public static void main(String[] args) {
//        int []marks = {5,10,15,20,25};
//        int avg=0;
//        for(int element:marks) {
//            avg+=element;
//        }
//        avg /= marks.length;
//        System.out.println(avg);
//    }
//    public static void main(String[] args) {
//        int[][] mat = {{1,2,3},{4,5,6}};
//        int[][] rix = {{6,5,4},{3,2,1}};
//        int[][] res = new int [2][3];
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[0].length; j++) {
//                res[i][j] = mat[i][j] + rix[i][j];
//            }
//        }
//        for (int[] arr:res) {
//            for(int ele:arr){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {0,1,2,3,4,5,6,7,8,9};
//        int n = arr.length-1;
//        for (int i = 0; i < arr.length/2; i++){
//            int temp = arr[i];
//            arr[i] = arr[n-i];
//            arr[n-i] = temp;
//        }
//        for (int ele:arr){
//            System.out.println(ele);
//        }
//    }
//public static void main(String[] args) {
//    int[] arr = {0,1,2,3,4,5,6,7,8,9};
//    int[] brr = new int[arr.length];
//    int n = arr.length-1;
//    for (int i = 0; i <= n; i++) {
//        brr[n-i] = arr[i];
//    }
//    int max=arr[0];
//    for(int element:arr){
//        if(max<element){
//            max = element;
//        }
//    }
//    System.out.println("The biggest element is "+max);
//}
public static void main(String[] args) {
    boolean bool = true;
    int[] arr = {1,2,3,4,5,6,7};
    for (int i = 0; i < arr.length-1; i++) {
        if(arr[i]>arr[i+1]){
            System.out.println("not shorted");
            bool = false;
            break;
        }
    }
    if(bool){
        System.out.println("shorted");
    }
}
}
