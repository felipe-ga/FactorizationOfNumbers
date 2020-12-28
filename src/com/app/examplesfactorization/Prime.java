/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.examplesfactorization;
/**
 *
 * @author Felipe Galindo
 */
public class Prime {
    /*
    Evaluate if a number X is prime or not
    */
    public static boolean isPrime(int x){
        int count = 0;
        if(x == 1){
            return false;
        }else if(x == 2){
            return true;
        }else if(x % 2 == 0){
            return false;
        }else{
            int sqrt =(int) Math.sqrt((double)x);
            for(int j=3; j <= sqrt; j = j + 2){
                if(x % j == 0){
                    count++;
                }
            }
            if(count == 0){
                return true;
            }else{
                return false;
            }
        }  
    }
}
