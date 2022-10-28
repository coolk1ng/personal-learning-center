package com.ez4me.handler;

import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlCleaner;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 资源清洗
 *
 * @author coolk1ng
 * @since 2022/10/3 23:22
 */
@Service
public class CustomerUrlCleaner implements UrlCleaner {
    @Override
    public String clean(String s) {
        if (StringUtils.isEmpty(s)) {
            return s;
        }
        if (s.startsWith("/clean/")){
            return "/clean/*";
        }
        return s;
    }
}
