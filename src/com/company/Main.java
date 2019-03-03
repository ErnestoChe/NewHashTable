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
        //System.out.println(f1+" "+f2+" "+f3+" "+f4+" "+f5);
        //System.out.println(f6);
        //System.out.println(ht.find("cab"));

        HashTable ht1 = new HashTable(19, 3);
        for(int i = 0; i < 20; i++){
            System.out.println("c записалось в "+ht1.put("c"));
        }
        //System.out.println(ht1.put("c"));
    }
}
