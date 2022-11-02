package com.coolk1ng.vavr;

import io.vavr.Tuple;
import io.vavr.Tuple2;

/**
 * 元组demo
 *
 * @author coolk1ng
 * @since 2022/11/1 14:19
 */
public class TupleDemo {
    public static void main(String[] args) {

        // 创建一个元组
        Tuple2<String, Integer> tuple = Tuple.of("hello", 1);
        String tuple_1 = tuple._1();
        Integer tuple_2 = tuple._2();
        System.out.println("元组1 = " + tuple_1);
        System.out.println("元组2 = " + tuple_2);

        // 映射元组属性
        Tuple2<String, Integer> tupleMap1 = tuple.map(String::toUpperCase, i -> i + 1);
        System.out.println(tupleMap1);

        Tuple2<String, Integer> tupleMap2 = tuple.map((i, s) -> Tuple.of(i.toUpperCase(), s + 2));
        System.out.println(tupleMap2);

        // 转换元组为新的类型
        String apply = tuple.apply((s, j) -> s.substring(2) + j + 2);
        System.out.println("转换后的元组" + apply);


    }
}
