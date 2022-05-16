package recursion;

public class Factorial {
    public static int factorial_recursive(int n){
        if(n<=0){
            return -1;
        }
        if(n==1){
            return n;
        }
        return n*factorial_recursive(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial_recursive(5));
    }
}
