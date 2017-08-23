package com.wxb.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.wxb.dubbo.api.DemoService;

/**
 * describe:
 *
 * @author : 王校兵
 * @version : v1.0
 * @time : 2017/8/21  23:44
 */
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
