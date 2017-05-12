package com.yourson;

/**
 * Created by xuwang on 2017/5/12.
 */
public class Goods {
    private String month;
    private String goods;

    public Goods(String m,String s) {
        month=m;
        goods=s;
    }

    public Goods() {
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
