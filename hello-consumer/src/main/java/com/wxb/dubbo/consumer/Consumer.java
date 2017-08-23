package com.wxb.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wxb.dubbo.api.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * describe:
 *
 * @author : 王校兵
 * @version : v1.0
 * @time : 2017/8/21  23:46
 */
@RestController
public class Consumer {

    @Reference
    private DemoService demoService;

    @RequestMapping("/hello")
    public String consumer(String name) {

        return demoService.sayHello(name);
    }

}
