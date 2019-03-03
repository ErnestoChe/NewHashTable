package com.company;

import java.security.Key;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*HashTable ht = new HashTable(19, 3);
        int p1 = ht.put("abc");
        int p2 = ht.put("bca");
        int p3 = ht.put("cab");
        int p4 = ht.put("acb");
        int p5 = ht.put("cba");
        //System.out.println(ht.put("aab"));

        int f1 = ht.find("abc");
        int f2 = ht.find("bca");
        int f3 = ht.find("bca");
        int f4 = ht.find("acb");
        int f5 = ht.find("cba");

        int f6 = ht.find("aab");*/

        HashTable ht1 = new HashTable(19, 3);
        int n;
        for(n = 1; n <= 98; n++) {
            String s2 = String.valueOf(n);
            int slot = ht1.put(s2);
            System.out.println(n+" "+slot);
        }
        System.out.println("test" + ht1.put(String.valueOf(n)));
    }
}
