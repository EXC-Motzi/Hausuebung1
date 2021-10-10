public class EratosthenesPrimeSieve implements PrimeSieve{
    public int n;
    public boolean[] prime;
    public EratosthenesPrimeSieve(int n, boolean[] prime) {
        this.n = n;
        this.prime = prime;
    }

    @Override
    public boolean isPrime(int p) {

        if (prime[p] == true) {
            return false;
        }else{
            return true;
        }

    }

    @Override
    public void printPrimes() {
       for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
}