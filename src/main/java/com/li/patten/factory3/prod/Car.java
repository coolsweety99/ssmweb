package com.li.patten.factory3.prod;

import com.li.patten.factory3.interf.Moveable;

public class Car implements Moveable {

    @Override
    public void run(double speed) {
        System.out.println("我是一辆小汽车，我目前的时速是:" + speed + "/小时");
    }

}
