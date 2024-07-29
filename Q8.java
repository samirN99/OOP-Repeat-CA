import java.util.HashSet;
import java.util.Set;

public class Q8 {


    public static Set<Integer> findPrimes(int n) {                  // method for finding all prime nums up to n
        Set<Integer> numbers = new HashSet<>();                     //creates a hashset
        for (int i = 2; i <= n; i++) {                                  // stores from 2 till n
            numbers.add(i);                                         //store each num in the set
        }


        int limit = (int) Math.sqrt(n);                                        //calc the square root of n, limits duplicates
        for (int i = 2; i <= limit; i++) {
            if (numbers.contains(i)) {                      //check if i is in the set and if it is a prime numeber
                for (int multiple = i * i; multiple <= n; multiple += i) {                          //clear all multiples
                    numbers.remove(multiple);
                }
            }
        }

        return numbers;                             // give the set that only contains prime numbers
    }

    public static void main(String[] args) {
        int N = 50;                                           //limit for finding prime numbers
        Set<Integer> primes = findPrimes(N);

        System.out.println("Prime numbers up to " + N + ":");
        for (Integer prime : primes) {                              //print the prime numbrs
            System.out.println(prime);
        }
    }


}




