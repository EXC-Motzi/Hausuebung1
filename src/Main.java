public class Main {
    public static void main(String args[]) {
        int n = 120;
        int p;
        boolean prime[] = new boolean[n + 1];
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve(n, prime);
        for (int i = 0; i <= n; i++)
            prime[i] = true;
        for (int i = 2; i*i <= n; i++) {
            p = i;
            if(e.isPrime(p) == false){
                for (int j = p*p; j <= n; j += p) {
                    prime[j] = false;
                }
            }
        }
        e.printPrimes();
        System.out.println("");
        e.eratosthenesPrimesSieve(10);
    }
}