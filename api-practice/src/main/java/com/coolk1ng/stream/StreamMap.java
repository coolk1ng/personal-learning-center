package com.coolk1ng.stream;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * stream流map
 *
 * @author coolk1ng
 * @since 2022/11/3 01:54
 */
public class StreamMap {
    private static final Logger LOGGER = LoggerFactory.getLogger(StreamMap.class);

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7);
        List<Integer> squareList = list.stream().map(i -> i * i).collect(Collectors.toList()); //计算平方数
        LOGGER.info("平方数:{}", JSON.toJSONString(squareList));

        Set<Integer> squareSet = list.stream().map(i -> i * i).collect(Collectors.toSet());
        LOGGER.info("平方数set:{}", JSON.toJSONString(squareSet));

        int sum = list.stream().mapToInt(i -> i).sum();
        System.out.println("sum = " + sum);

        LongSummaryStatistics statistics = list.stream().mapToLong(i -> i).summaryStatistics();
        System.out.println(statistics.getMax());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getCount());
    }
}
