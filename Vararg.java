public class Vararg {
    public static int sum(int x, int ...arr){
        int total = x;
        for(int ele:arr){
            total += ele;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
    }
}
