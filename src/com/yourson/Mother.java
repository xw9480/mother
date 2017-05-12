package com.yourson;

/**
 * Created by xuwang on 2017/5/12.
 */
public class Mother {
    private String say;

    public Mother(){

    }

    public Mother(String say){
        this.say=say;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    @Override
    public String toString() {
        return say;
    }
}
