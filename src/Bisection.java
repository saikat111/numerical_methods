import java.util.Scanner;

public class Bisection {
    static final float ERROR = (float) 0.0005;
    static  double root(double x){
     /*   return x * x * x + 3 * x-5;*/
        return 3* x - Math.cos(x)-1;
    }
    static void bisectionMethod(double a ,double b){
        if(root(a) * root(b) >= 0){
            System.out.println("a and b is not right");
            return;
        }
        double c =a;
        int ita = 0;
        while ((b - c) >= ERROR){
            c = (a + b)/2;
            if(root(c)== 0.0){
                break;
            }
            else if(root(c) * root(a) <0){
                b = c;
            }
            else {
                a = c;
            }
            ita++;
            System.out.println("iterations " + ita + " a is : " + a + " b is : " + b + " a/b is: "+c );
        }
        System.out.println();
        System.out.printf("The value of root is : %.3f", c);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double a ,b;
        System.out.println("Enter the a : ");
        a = scanner.nextDouble();
        System.out.println("Enter the b : ");
        b = scanner.nextDouble();
        bisectionMethod(a,b);

    }
}
