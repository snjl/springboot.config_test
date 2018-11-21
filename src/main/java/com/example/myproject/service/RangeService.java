package com.example.myproject.service;

import com.example.myproject.domain.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 34924
 */
@Service
public class RangeService {

    @Autowired
    private Range range;

    public Range getRange() {
        return range;
    }
}
