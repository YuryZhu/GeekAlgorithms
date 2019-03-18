public class Main {

    public static void main(String[] args) {
        System.out.println(product(3, 100));
    }
    //f(n) = (n * n) b раз
    //f(n) = (n * n * b-1) * n

    public static long productRec(int a, int b) {
        if (b == 0) {
            return 1;
        }
        else if (b == 1) {
            return a;
        }
        else {
            return productRec(a, b - 1) * a;
        }
    }

    public static long product(int a, int b) {
        long sum = 1;
        while (b > 0) {
            sum *= a;
            b--;
        }
        return sum;
    }
}
