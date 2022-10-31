package com.zqxy.server.member.Impl;

import com.zqxy.server.member.api.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @Create 2022-10-31  13:07
 */
@RestController
public class MemberServiceImpl implements MemberService {
    @Value("${server.port}")
    String serverport;

    @Override
    public String getUser(Integer userid) {
        return "MemberServiceImpl"+serverport;
    }

}
