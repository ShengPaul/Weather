package com.test.csf;

public class TestScf {
    public static void main(String[] args){
        DemoServiceImpl demoServiceImplPort = new DemoServiceImplService().getDemoServiceImplPort();
        String msg = demoServiceImplPort.geeCxfMsg("圣保罗");
        System.out.println(msg);
    }
}
