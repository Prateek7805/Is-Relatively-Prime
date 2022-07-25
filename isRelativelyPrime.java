import java.util.*;

class isRelativelyPrime{
    public static int GCD(int div,int divi){
        int rem = divi%div;
        if(rem ==0){
            return div;
        }
        return GCD(rem, div);
    }
    public static boolean isRP(int a , int b){
        if(a>b){
            int temp  = a;
            a = b;
            b = temp;
        }
        return GCD(a,b) == 1;
    }
    public static void main(String args[]){
        System.out.println("Enter 2 numbers");
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(isRP(a,b)){
            System.out.printf("The numbers %d and %d are relatively prime\n", a, b);
        }else{
            System.out.printf("The numbers %d and %d are not relatively prime\n", a, b);
        }
    }
}