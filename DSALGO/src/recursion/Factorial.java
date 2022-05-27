package recursion;

public class Factorial {
    /*
    Factorial of a number is the product of 1 to that number
    i.e 4! = 4*3*2*1 = 24
    3! = 3*2*1 = 7
     */

    public static int factorial_recursive(int n){
        //additional condition check
        if(n<=0){
            return -1;
        }
        //base condition
        if(n==1){
            return n;
        }
        //recursive flow logic
        return n*factorial_recursive(n-1);
    }
    public static void main(String[] args) {
        //calling recursive function to find factorial
        System.out.println(factorial_recursive(3));
    }
}
