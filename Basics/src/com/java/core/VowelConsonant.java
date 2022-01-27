package com.java.core;

public class VowelConsonant {
	public static void main(String[] args) {

        char ch = 'D';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' && ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}
