package com.zqxy.server.order.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shkstart
 * @Create 2022-10-31  13:24
 */
@FeignClient("member-producer")
public interface MemberServiceFeign{
//   TODO 如果请求参数没有加注解，默认采用post请求

    @GetMapping("/getuser")
    String getUser(@RequestParam("userid")Integer userid);
}
