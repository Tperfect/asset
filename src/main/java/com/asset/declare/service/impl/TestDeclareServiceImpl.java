package com.asset.declare.service.impl;

import com.asset.declare.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestDeclareServiceImpl implements TestService {
    public void test() {
        System.out.println("TestService");
    }
}
