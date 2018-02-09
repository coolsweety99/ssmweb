package com.li.patten.bridge;

/**
 * <p>
 * 中杯咖啡
 * </p>
 * Create Date: 2016年3月17日
 * Last Modify: 2016年3月30日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.2
 */
public class MediumCoffee extends Coffee {

    private int capacity = 0;
    
    public MediumCoffee(Addable addable) {
        super(addable);
    }

    @Override
    public void brewing() {
        System.out.println("正在冲泡中杯咖啡...");
        capacity = 300;
    }

    @Override
    public void showCapacity() {
        System.out.println(capacity + " mL");
    }

    @Override
    public void showAddable() {
        System.out.println(addable);
    }
}