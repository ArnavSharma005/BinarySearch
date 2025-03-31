
package com.example.binarysearchapi.controller;

import com.example.binarysearchapi.dto.BinarySearchRequest;
import com.example.binarysearchapi.dto.BinarySearchResponse;
import com.example.binarysearchapi.service.BinarySearchService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/search")
public class BinarySearchController {

    private final BinarySearchService binarySearchService;

    @Autowired
    public BinarySearchController(BinarySearchService binarySearchService) {
        this.binarySearchService = binarySearchService;
    }

    @PostMapping("/binary")
    public ResponseEntity<BinarySearchResponse> performBinarySearch(
            @Valid @RequestBody BinarySearchRequest request) {
        BinarySearchResponse response = binarySearchService.performBinarySearch(
                request.getArray(), request.getTarget());
        return ResponseEntity.ok(response);
    }
}