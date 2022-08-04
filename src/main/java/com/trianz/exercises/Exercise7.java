package com.trianz.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Exercise7 {

	public static void main(String[] args) {
		// arr[] = {1:00, 1:40, 1:50, 2:00, 2:15, 4:00}
        // dep[] = {1:10, 3:00, 2:20, 2:30, 3:15, 6:00}
 
        int arr[] = {100, 140, 150, 200, 215, 400};
        int dep[] = {110, 210, 230, 300, 315, 600};
        Map<Integer, String> timings = new HashMap<Integer, String>();
        
        Arrays.parallelSort(arr);
        Arrays.parallelSort(dep);
        int arrSize = arr.length;
        int depSize = dep.length;
        int platform_needed = 0, maxPlatforms = 0;
//        for( int i = 0, j=0; (i<arrSize && j<depSize);) {
//        	System.out.println(arr[i] + "    " + dep[j]);
//        	if (arr[i] < dep[j])
//            {
//                platform_needed++;
//                i++;
//                if (platform_needed > maxPlatforms)
//                    maxPlatforms = platform_needed;
//            }
//        	
//            if (arr[i] > dep[j]) 
//            {
//                platform_needed--;
//                j++;
//            }	
//        }
        int i = 0, j = 0;
        
        // Similar to merge in merge sort
        while (i < arrSize && j < depSize)
        {
            if (arr[i] < dep[j])
            {
                platform_needed++;
                i++;
                if (platform_needed > maxPlatforms)
                    maxPlatforms = platform_needed;
            }
            else
            {
                platform_needed--;
                j++;
            }
        }
        System.out.println("max platforms : " + maxPlatforms);
    	for (int k=0; k< arrSize; k++) {
    		timings.put(arr[k], "A");
    	}
    	for (int k=0; k< depSize; k++) {
    		timings.put(dep[k], "D");
    	}

    	System.out.println();
	}

}
