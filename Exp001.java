public class Exp001 {

    public static void main(String[] args){
        es002 obj = new es002();
        int val = obj.fibonacci(5);
        System.out.println(val);
    }

}
class es002{
    public int fibonacci(int n) {
        if (n==1) {
            return n;
        }
        else {
            return fibonacci(n-1) * n;
        }
    }
}
