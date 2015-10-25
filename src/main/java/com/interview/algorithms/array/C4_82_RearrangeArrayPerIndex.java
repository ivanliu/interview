package com.interview.algorithms.array;

import com.interview.utils.ConsoleReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array arr[] of size n where every element is in range from 0 to n-1. 
 * Rearrange the given array so that arr[i] becomes arr[arr[i]]. This should be done with O(1) extra space.
 * 
 * @author Kai Liu (kailiu@yahoo.com)
 */
public class C4_82_RearrangeArrayPerIndex {

    public static void rearrange(Integer[] a) {
        
        int len = a.length;
        
        for (int i = 0; i < len; i++) {
            a[i] += (a[a[i]] % len) * len; 
        }
        
        for (int i = 0; i < len; i++) {
            a[i] /= len;
        }
        
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Rearrange an array so that arr[i] becomes arr[arr[i]] with O(1) extra space");
        System.out.println("========================================================================");
        ConsoleReader reader = new ConsoleReader();
        System.out.print("Please input the array elements: ");
        int[] inputs = reader.readIntItems();
        List<Integer> array = new ArrayList<Integer>();
        ;
        for (int input : inputs) {
            array.add(Integer.valueOf(input));
        }
        
        C4_82_RearrangeArrayPerIndex.rearrange(array.toArray());
        System.out.println("Results: " + array.toString());
    }

}
