import java.util.Scanner;
public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double []arr= new double[]{1.4, 2, 3, 4, 5, 6, 7};
        staticEx(arr);
        int[][][] arr2D = new int[2][2][2];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                for (int k = 0; k < arr2D[i][j].length; k++) {
                    arr2D[i][j][k] = sc.nextInt();
                }
            }
        }
        Arr obj = new Arr();
        obj.extracted(arr2D);
    }

    private static void staticEx(double[] arr) {
        for(double ele: arr){
            System.out.println(ele);
        }
    }

    void extracted(int[][][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                for (int k = 0; k < arr2D[i][j].length; k++) {
                    System.out.println("array = " + arr2D[i][j][k]);
                }
            }
        }
    }
}
