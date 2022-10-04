package Book.DavidFlanagan;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
        System.out.println(calculateFactorial2(5));
    }
    static int calculateFactorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static int calculateFactorial2(int x) {
        if (x <= 1){
            return 1;
        }else {
            return x * calculateFactorial2(x - 1);
        }
    }
}
