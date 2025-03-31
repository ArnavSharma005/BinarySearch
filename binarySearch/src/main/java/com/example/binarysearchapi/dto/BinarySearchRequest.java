package com.example.binarysearchapi.dto;

import jakarta.validation.constraints.NotNull;
import java.util.List;

public class BinarySearchRequest {
    
    @NotNull(message = "Array cannot be null")
    private List<Integer> array;
    
    @NotNull(message = "Target value cannot be null")
    private Integer target;
    
    public BinarySearchRequest() {
    }
    
    public BinarySearchRequest(List<Integer> array, Integer target) {
        this.array = array;
        this.target = target;
    }
    
    public List<Integer> getArray() {
        return array;
    }
    
    public void setArray(List<Integer> array) {
        this.array = array;
    }
    
    public Integer getTarget() {
        return target;
    }
    
    public void setTarget(Integer target) {
        this.target = target;
    }
}
