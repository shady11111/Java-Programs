package com.example.Strings;

import java.util.Scanner;

public class Encoding {
	public static void main(String[] args) {
        // Example usage of the first code snippet
        encodeBasicString();

        // Example usage of the modified second code snippet
        encode();
    }
	
	static void encodeBasicString() {
        String s1 = "aaabbcdd";
        char[] a = s1.toCharArray();
        int i = 0;
        String s2 = "";
        while (i < a.length) {
            char c = a[i];
            int count = 1;
            i++;
            while (i < a.length && c == a[i]) {
                count++;
                i++;
            }
            s2 = s2 + count + c;
        }
        System.out.println(s2);
    }
	
	static void encode() {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String s1 = scn.next();
            System.out.println("Encoding level:");
            int encodingLevel = scn.nextInt();
            String s2 = "";
            char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            char[] array = s1.toLowerCase().toCharArray();
            for (char c : array) {
                if (Character.isLetter(c)) {
                    int index = c - 'a';
                    index += (encodingLevel % 26);
                    s2 += alphabets[index % 26];
                } else {
                    // Non-letter characters are not encoded
                    s2 += c;
                }
            }
            System.out.println(s2);
        }
    }
}