/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.examplesfactorization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe Galindo
 */
public class FactorizationWithNumbersPrime {
    
    /*
    Find the factorization of numbers primes of a number x
    */
    public static List<Integer> factorizationPrime(int x){
        List<Integer> numbersPrimes = new ArrayList<Integer>();
        for(int i = 2;i <= x;i++){
            int div = x;
            if(Prime.isPrime(i)){
                int mod = div % i;
                while(mod == 0 && div > 1){
                   numbersPrimes.add(i);
                   div = div / i;
                   mod = div % i;
                }
            }
        }
        return numbersPrimes;
    }
    
    public static void main(String[] args) {
        int x = 26;
        List<Integer> numbersPrimes = factorizationPrime(x);
        numbersPrimes.forEach(n -> System.out.print(n + "X"));
    }
}
