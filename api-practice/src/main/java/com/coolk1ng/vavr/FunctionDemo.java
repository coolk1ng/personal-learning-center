package com.coolk1ng.vavr;

import io.vavr.Function2;

/**
 * FunctionDemo
 *
 * @author coolk1ng
 * @since 2022/11/1 14:33
 */
public class FunctionDemo {
    public static void main(String[] args) {
        // 创建一个对两个整数求和的函数
        Function2<Integer, Integer, Integer> sum = Integer::sum;
        System.out.println(sum.apply(2, 3));

        // 匿名内部类写法
        Function2<Integer, Integer, Integer> functionSum = new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };
        System.out.println(functionSum.apply(3, 4));


    }
}
