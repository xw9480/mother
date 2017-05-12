package com.yourson;

import java.util.Random;

/**
 * Created by xuwang on 2017/5/13.
 */
public class Actor extends Thread {
    Box box = new Box();
    public void run (){
        box.box();
        String a = "岁";
        Random random = new Random();
        int count = 0;


        boolean keepRunning = true;
        while (keepRunning){
            if (count == 100)
                keepRunning = false;
            if (count%3==0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int b = random.nextInt(23)+22;
            System.out.println("["+getName()+b+a+","+"我"+(b-22)+a+"]>>>妈妈说: "+box.list1.get(random.nextInt(7)).toString());
            ++count;
        }


    }

    public static void main(String[] args) {
        System.out.println("---------------------那一年，妈妈24岁-----------------------");
        Box box = new Box();
        box.box();
        for (Goods a:box.list) {
            System.out.println(a.getMonth()+a.getGoods());
        }

        System.out.println("---------------------我长大了-----------------------");
        Thread actor = new Actor();
        actor.setName("妈");

        actor.start();

        Thread actressThread = new Thread(new Actress(),"我");
        actressThread.start();

    }
}

class Actress implements Runnable{
    Box box = new Box();
    @Override
    public void run() {

        box.box();
        String a = "岁";
        Random random = new Random();
        int count = 0;


        boolean keepRunning = true;
        while (keepRunning){
            if (count == 100)
                keepRunning = false;
            if (count%3==0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            int b = random.nextInt(23)+22;
            String c = box.list2.get(random.nextInt(5)).toString();
            System.out.println("["+Thread.currentThread().getName()+(b-22)+a+","+"妈"+b+a+"]<<<我说要: "+"["+c+"],"+"  妈妈给你"+"["+c+"]");
            ++count;
        }


    }
}
