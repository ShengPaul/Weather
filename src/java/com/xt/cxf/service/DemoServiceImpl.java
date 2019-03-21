package com.xt.cxf.service;

import javax.jws.WebService;

@WebService
public class DemoServiceImpl implements IDemoService {
    @Override
    public String geeCxfMsg(String name) {
        return "你好"+name;
    }
}
