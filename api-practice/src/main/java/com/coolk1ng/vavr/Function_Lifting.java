package com.coolk1ng.vavr;

import io.vavr.Function2;
import io.vavr.control.Option;

/**
 * Function_Lifting
 *
 * @author coolk1ng
 * @since 2022/11/1 14:48
 */
public class Function_Lifting {

    public static void main(String[] args) {
        //1.  您可以将部分函数提升为返回结果的总函数Option
        Function2<Integer, Integer, Integer> divide = (a, b) -> a / b;
        Function2<Integer, Integer, Option<Integer>> lift = Function2.lift(divide);
        // 如果使用不允许的输入值调用函数，则提升的函数将返回None而不是引发异常
        System.out.println(lift.apply(2, 0));


    }


    int sum(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("不允许负数");
        }
        return a + b;
    }
}
