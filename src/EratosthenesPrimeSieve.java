public class EratosthenesPrimeSieve implements PrimeSieve {
    public int n;
    public boolean[] prime;

    public EratosthenesPrimeSieve(int n, boolean[] prime) {
        this.n = n;
        this.prime = prime;
    }

    void eratosthenesPrimesSieve() {
        int max = 10;
        int number1;
        int number2;
        int result;
        for (int i = 3; i < max; i++) {
            if (i % 2 == 0) {
                boolean primes[] = new boolean[i];
                for (int j = 0; j < i; j++)
                    primes[j] = true;

                for (int p = 2; p * p <= i; p++) {

                    if (primes[p] == true) {
                        for (int y = p * p; y < i; y += p) {
                            primes[y] = false;
                        }
                    }
                }
                for (int j = 0; j < i; j++) {
                    if (primes[j] == true) {
                        number1 = j;
                        for (int y = 0; y < i; y++) {
                            if (primes[y] == true) {
                                number2 = y;
                                result = number1 + number2;
                                if (result == i) {
                                    System.out.println(number1 + " + " + number2 + " = " + result);

                                }
                            }
                        }
                    }
                }
            }
        }

    }
    @Override
    public boolean isPrime ( int p){

        if (prime[p] == true) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public void printPrimes () {
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
}
