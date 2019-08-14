package com.dubbo.serverdubbo.service.impl;

import com.dubbo.serverdubbo.service.ElasticService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElasticServiceImpl implements ElasticService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ElasticServiceImpl.class);
    @Override
    public String helloDubbo(String msg) {
        System.out.println(msg);
        return "hi!" + msg;
    }
}
