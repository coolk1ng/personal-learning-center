package com.coolk1ng.vavr;

import io.vavr.Function1;

/**
 * Function-Composition
 * @author coolk1ng
 * @since 2022/11/1 14:42
 */
public class Function_Composition {

    public static void main(String[] args) {
        /*
         * 您可以编写函数。在数学中，函数组合是将一个函数应用于另一个函数的结果以产生第三个函数。例如，函数 f : X → Y 和 g : Y → Z 可以组合产生h: g(f(x))映射 X → Z的函数
         * */
        Function1<Integer, Integer> plusOne = a -> a + 1;
        Function1<Integer, Integer> multiplyByTwo = a -> a * 2;
        Function1<Integer, Integer> addAndMultiply = plusOne.andThen(multiplyByTwo);
        System.out.println(addAndMultiply.apply(3));



    }
}
