package com.li.patten.factory3.prod;

import com.li.patten.factory3.interf.Writeable;

public class Pen implements Writeable {

    @Override
    public void write(String label) {
        System.out.println("我是一支钢笔。我刚刚写下一句：“" + label + "”。");
    }

}
