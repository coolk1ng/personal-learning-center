package com.coolk1ng.stream;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * stream流筛选和切片
 *
 * @author coolk1ng
 * @since 2022/11/3 02:14
 */
public class StreamFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(StreamFilter.class);

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("a", "ab", "ab", "abc", "abc", "abcd");
        Map<String, String> collect = strList.stream().filter(i -> i.length() > 2).distinct().collect(Collectors.toMap(i -> i, v -> v, (i, v) -> i));
        System.out.println(JSON.toJSON(collect));
    }
}
