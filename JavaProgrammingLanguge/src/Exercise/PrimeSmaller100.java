package Exercise;

public class PrimeSmaller100 {
    public static void main(String[] args) {
        int n;
        boolean result;
        for(n = 2; n < 100; n++) {
            result = true;
            for(int i = 2 ; i < n; i++) {
                if (n % i == 0) {
                    result = false;
                    break;
                }
                if (result = true) {
                    System.out.println(n);
                    break;
                }
            }

        }
    }
}
