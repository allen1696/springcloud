package com.zqxy.server.member.Impl;

import com.zqxy.server.member.api.MemberService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @Create 2022-10-31  13:07
 */
@RestController
public class MemberServiceImpl implements MemberService {
    @Override
    public String getUser(Integer userid) {
        return "MemberServiceImpl";
    }
}
