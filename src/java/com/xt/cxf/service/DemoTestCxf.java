package com.xt.cxf.service;

import javax.xml.ws.Endpoint;

public class DemoTestCxf {
    public static void main(String[] args){

        IDemoService demoService = new DemoServiceImpl();
        Endpoint.publish("http://localhost:9999/javaws/xtkj",demoService);

        System.out.println("启动成功");
    }
}
