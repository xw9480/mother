package com.yourson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuwang on 2017/5/12.
 */
public class Box {
    public List<Goods> list;
    public List<Mother> list1;
    public List<Me> list2;

    public void box(){
        list = new ArrayList();
        list.add(new Goods("[第1月] ","今天，妈妈的体温38°，比平常高了0.5°"));
        list.add(new Goods("[第2月] ","妈妈吐得很厉害，是你捣的鬼吗？"));
        list.add(new Goods("[第3月] ","妈妈看到了你的手指，很可爱，不过看上去还有点像鸭蹼"));
        list.add(new Goods("[第4月] ","你身高8cm，但是已经有指纹了"));
        list.add(new Goods("[第5月] ","医生说看到你在吸吮自己的大拇指，我想知道，那是什么味道"));
        list.add(new Goods("[第6月] ","眉毛和眼皮都长出来了,天生就是爱运动"));
        list.add(new Goods("[第7月] ","妈妈看到你的大脑在长大，我想，你一定是个聪明的孩子"));
        list.add(new Goods("[第8月] ","你偶尔会张开双眼，似乎看到什么，又似乎没有看到"));
        list.add(new Goods("[第9月] ","妈妈看到你越来越强壮，很开心"));
        list.add(new Goods("[第10月] ","哇喔，你来了，50cm，你很开心，可妈妈很痛"));

        list1 = new ArrayList();
        list1.add(new Mother("给你打了点生活费"));
        list1.add(new Mother("天冷了，多加衣"));
        list1.add(new Mother("天热了，买点衣服吧"));
        list1.add(new Mother("都10点了，还不起床"));
        list1.add(new Mother("快点，要迟到了"));
        list1.add(new Mother("有点出息行不"));
        list1.add(new Mother("妈妈想你了..."));

        list2 = new ArrayList();
        list2.add(new Me("AD钙奶"));
        list2.add(new Me("棒棒糖"));
        list2.add(new Me("Mac"));
        list2.add(new Me("糖葫芦"));
        list2.add(new Me("自行车"));

    }





}
