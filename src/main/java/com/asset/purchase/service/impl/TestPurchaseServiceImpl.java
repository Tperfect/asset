package com.asset.purchase.service.impl;

import com.asset.declare.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestPurchaseServiceImpl implements TestService {
    public void test() {
        System.out.println("TestService");
    }
}
