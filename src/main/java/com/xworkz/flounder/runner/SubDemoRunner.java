package com.xworkz.flounder.runner;

public class SubDemoRunner extends DemoRunner{

    public void main1(String[] args) {
        System.out.println("bye");
        super.main1(new String[1]);
    }

    public static void main(String[] args) {
        System.out.println("main.....");
        SubDemoRunner sub=new SubDemoRunner();
        sub.main1(new String[]{});
    }

}
