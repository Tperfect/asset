package com.asset.stock.service.impl;

import com.asset.declare.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestStockServiceImpl implements TestService {
    public void test() {
        System.out.println("TestService");
    }
}
