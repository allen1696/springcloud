package com.zqxy.server.member.api;

import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author shkstart
 * @Create 2022-10-31  13:03
 */
public interface MemberService {

    @GetMapping("/getuser")
    String getUser(Integer userid);
}
