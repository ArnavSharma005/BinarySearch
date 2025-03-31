package com.example.binarysearchapi.service;

import com.example.binarysearchapi.dto.BinarySearchResponse;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

@Service
public class BinarySearchService {

    public BinarySearchResponse performBinarySearch(List<Integer> array, Integer target) {
        // Create a copy of the array to avoid modifying the original
        List<Integer> sortedArray = getSortedArray(array);
        
        long startTime = System.nanoTime();
        int comparisons = 0;
        
        int left = 0;
        int right = sortedArray.size() - 1;
        int foundIndex = -1;
        
        while (left <= right) { //perform binary search
            int mid = left + (right - left) / 2;
            comparisons++;
            if (sortedArray.get(mid).equals(target)) {
                foundIndex = mid;
                break;
            }
            if (sortedArray.get(mid) < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        
        boolean found = foundIndex != -1;
        
        return new BinarySearchResponse(
                found ? foundIndex : null,
                found,
                comparisons,
                executionTime
        );
    }
    
    private List<Integer> getSortedArray(List<Integer> array) {
        if (array == null || array.isEmpty()) {
            return new ArrayList<>();
        }
        List<Integer> sortedArray = new ArrayList<>(array);
        //checking if already sorted
        boolean isSorted = true;
        for (int i = 0; i < sortedArray.size() - 1; i++) {
            if (sortedArray.get(i) > sortedArray.get(i + 1)) {
                isSorted = false;
                break;
            }
        }
        if (!isSorted) {
            Collections.sort(sortedArray);
        }
        
        return sortedArray;
    }
}