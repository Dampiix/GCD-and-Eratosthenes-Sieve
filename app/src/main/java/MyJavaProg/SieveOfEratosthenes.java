package MyJavaProg;

public class SieveOfEratosthenes {
     public int[] calcSieveOfEratosthenes(int maxNum){
        maxNum++;
        boolean[] nums = new boolean[maxNum];
        //Alle geraden Zahlen streichen
        for (int p = 0; p < maxNum; p++){
            nums[p] = p%2 == 1;
        }

        //alle Vielfachen streichen
        for ( int prime = 3; prime < maxNum; prime += 2){
            if (nums[prime]){
                for (int i = prime; i <= maxNum / prime; i++) {
                    int x = i * prime;
                    if (x < maxNum)
                        nums[x] = false;
                }
            }
        }

        //Zähle die Primzahlen
        int count = 0;
        for (boolean isPrime : nums) {
            if (isPrime) {
                count++;
            }
        }

        int[] primes = new int[count];

        int index = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i])
                primes[index++] = i;
        //2 als Primzahl wieder hinzufügen
        primes[0] = 2;
        return primes;
    }
}
