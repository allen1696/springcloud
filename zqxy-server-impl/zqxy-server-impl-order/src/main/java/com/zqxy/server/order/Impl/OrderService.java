package com.zqxy.server.order.Impl;

import com.zqxy.server.order.openfeign.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @Create 2022-10-31  13:20
 */
@RestController
public class OrderService {
    @Autowired
    private MemberServiceFeign memberServiceFeign;
    /**
     * 基于feign
     * @return
     */
    @RequestMapping("/order")
    public String OrderFeignTOMember(){
        String user = memberServiceFeign.getUser(1);
        return "order:"+user;
    }
}
