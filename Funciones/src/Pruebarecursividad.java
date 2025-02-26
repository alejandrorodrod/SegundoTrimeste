public class Pruebarecursividad {
    public static long factorial(int n) {
        long result;
        if (n < 2) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}