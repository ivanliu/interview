package com.interview.algorithms.array;

import java.util.ArrayList;
import java.util.List;

import com.interview.utils.ConsoleReader;

/**
 * Given an array arr[] of size n where every element is in range from 0 to n-1. 
 * Rearrange the given array so that arr[i] becomes arr[arr[i]]. This should be done with O(1) extra space.
 * 
 * @author Kai Liu (kailiu@yahoo.com)
 */
public class C4_82_RearrangeArrayPerIndex {

    public static void rearrange(List<Integer> a) {
        
        int len = a.size();
        
        for (int i = 0; i < len; i++) {
            int new_val = a.get(i) + (a.get(a.get(i)) % len) * len;
            a.set(i, new_val);
        }
        
        for (int i = 0; i < len; i++) {
            a.set(i, a.get(i)/len);
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
        
        C4_82_RearrangeArrayPerIndex.rearrange(array);
        System.out.println("Results: " + array.toString());
    }

}
