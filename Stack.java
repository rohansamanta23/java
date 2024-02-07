import java.util.Scanner;
class Ar{
    int[] stack;
    int top=-1;
    Ar(int value){
        stack= new int[value];
    }
    void push(int data){
        top++;
        stack[top] = data;
    }
    void pop(){
        System.out.println( stack[top] + "is popped");
        stack[top]=0;
        top--;
    }
    void display(){
        System.out.println("Display All elements-");
        for(int i=0;i<=top;i++){
            System.out.println(stack[i]);
        }
    }

}
public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of stack:");
        int value = sc.nextInt();
        Ar arr = new Ar(value);
        int x;
        do{
            System.out.println("1.PUSH a element\n2.PUSH all the elements\n3.POP\n4.DISPLAY\n5.STOP");
            System.out.print("Enter the choice:");
            x = sc.nextInt();
            switch(x){
                case 1:
                        if(arr.top>=value-1){
                            System.out.println("STACK OVERFLOW");
                        }else{
                            System.out.print("Enter the element:");
                            int data = sc.nextInt();
                            arr.push(data);
                        }
                        break;
                case 2:
                        while(true){
                            if(arr.top>=value-1){
                                System.out.println("STACK OVERFLOW");
                                break;
                            }else{
                                System.out.print("Enter the element:");
                                int data = sc.nextInt();
                                arr.push(data);
                            }
                        }
                        break;

                case 3:
                        if(arr.top==-1){
                            System.out.println("STACK EMPTY");
                        }else{
                            arr.pop();
                        }
                        break;
                case 4:
                        arr.display();
                        break;
                case 5:
                        System.out.println("Stack Ended");
                        break;
                default:
                        System.out.println("error");
            }
        }while(x!=5);

    }
}