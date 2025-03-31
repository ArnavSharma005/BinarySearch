package com.example.binarysearchapi.dto;

public class BinarySearchResponse {
    
    private Integer index;
    private Boolean found;
    private Integer comparisons;
    private Long executionTimeNanos;
    
    public BinarySearchResponse() {
    }
    
    public BinarySearchResponse(Integer index, Boolean found, Integer comparisons, Long executionTimeNanos) {
        this.index = index;
        this.found = found;
        this.comparisons = comparisons;
        this.executionTimeNanos = executionTimeNanos;
    }
    
    // Getters and setters
    public Integer getIndex() {
        return index;
    }
    
    public void setIndex(Integer index) {
        this.index = index;
    }
    
    public Boolean getFound() {
        return found;
    }
    
    public void setFound(Boolean found) {
        this.found = found;
    }
    
    public Integer getComparisons() {
        return comparisons;
    }
    
    public void setComparisons(Integer comparisons) {
        this.comparisons = comparisons;
    }
    
    public Long getExecutionTimeNanos() {
        return executionTimeNanos;
    }
    
    public void setExecutionTimeNanos(Long executionTimeNanos) {
        this.executionTimeNanos = executionTimeNanos;
    }
}