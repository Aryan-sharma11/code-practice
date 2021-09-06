package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    static boolean maxdis(int[] arr,int k) {
        HashMap<Integer, Integer> m = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {

                if (i - m.get(arr[i]) <= k)
                    return true;
            }
            else
                m.put(arr[i], i);

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 4};
        System.out.println(maxdis(arr,3));
    }
}
	// write your code here