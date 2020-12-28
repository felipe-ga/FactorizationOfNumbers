package com.app.examplesfactorization;

import static com.app.examplesfactorization.FactorizationWithNumbersPrime.factorizationPrime;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author anonimo
 */
public class Factorization {
    /*
    Find all the posibles pairs of factors of number x
    */
    public static List<Integer> factorization(int x){
        List<Integer> numbersPrimes = new LinkedList<Integer>();
        numbersPrimes.add(1);
        numbersPrimes.add(x);
        int len = x;
        for(int i = 2;i < len;i++){
            int mod = x % i;
            int div = x / i;
            if(mod == 0 && !(numbersPrimes.contains(i) && numbersPrimes.contains(div))){
                numbersPrimes.add(i);
                numbersPrimes.add(div);
            }
        }
        return numbersPrimes;
    }
    
    public static void main(String[] args) {
        int x = 36;
        List<Integer> numbersPrimes = factorization(x);
        numbersPrimes.forEach(n -> System.out.print(n + "X"));
    }
}
