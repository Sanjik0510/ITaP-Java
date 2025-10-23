public class Primes{
    public static void main(String[] args){
        for (int n=1; n <= 1000; n++){
            if (isPrime(n)){
                System.out.print(n + " ");
            }
        }
    }

    static boolean isPrime(int n) {

        for (int i=2; i <= (int) Math.sqrt(n); i++){

            if (n % i == 0){
                return false;
            }
        }
        if (n==1){
            return false;
        }

        return true;
    }
}



