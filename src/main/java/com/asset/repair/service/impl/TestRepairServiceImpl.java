package com.asset.repair.service.impl;

import com.asset.declare.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestRepairServiceImpl implements TestService {
    public void test() {
        System.out.println("TestService");
    }
}
