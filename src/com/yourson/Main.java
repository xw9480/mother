package com.yourson;

/**
 * Created by xuwang on 2017/5/13.
 */
public class Main {
    public static void main(String[] args) {
        Box b = new Box();
        b.box();
        for (Goods a:b.list) {
            System.out.println(a.getMonth()+a.getGoods());
        }

        System.out.println(b.list1.get(1).toString());
    }
}
