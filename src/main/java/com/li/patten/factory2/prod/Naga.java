package com.li.patten.factory2.prod;

import com.li.patten.factory2.interf.DotAHero;

public class Naga implements DotAHero {

    @Override
    public void choose() {
        System.out.println("你选择了英雄" + getClass().getSimpleName());
    }

}
