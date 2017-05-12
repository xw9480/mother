package com.yourson;

/**
 * Created by xuwang on 2017/5/12.
 */
public class Me{
    private String want;

    public Me(){

    }

    public Me(String want){
        this.want=want;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }

    @Override
    public String toString() {
        return want;
    }

}
