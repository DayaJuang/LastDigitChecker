package org.example;

public class Main {
    public static void main(String[] args) {
        boolean ans =hasSameLastDigit(21,32,431);
        System.out.println(ans);
    }

    public static boolean isValid(int n){
        return n >= 10 && n <= 1000;
    }

    public static boolean hasSameLastDigit(int a,int b,int c){
        // Check if the number is valid or not
        // If valid, check if the last digit of number share the same digit
        if(isValid(a) && isValid(b) && isValid(c))
            return ((a%10) == (b%10) || (a%10) == (c%10) || (b%10) == (c%10));

        return false;   // if input not valid return false
    }
}