package com.sjms.wq.策略模式.demoone.interfaces.iml;

import com.sjms.wq.策略模式.demoone.interfaces.QuackBehavior;

/**
 * @Author: 世墨
 * @Date: 2022/2/16 13:49
 * @DESCRIPTION 会叫的鸭子 叽叽叫
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我要叽叽叫！！！！");
    }
}
