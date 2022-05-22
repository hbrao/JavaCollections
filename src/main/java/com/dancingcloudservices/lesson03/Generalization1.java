package com.dancingcloudservices.lesson03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generalization1 {
    public static void showAll(List al) {
        for (Object obj : al) {
            System.out.println("> " + obj);
        }
    }
    
    public static List getLonger(List al) {
        List rv = new LinkedList(al);
        rv.add("More data");
        return rv;
    }
    
    public static void main(String[] args) {
        List data = new ArrayList();
        data.add("item one");
        data.add("item two");
        data = getLonger(data);
        showAll(data);
    }
}
