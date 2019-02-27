package com.fbstore.member.controller;

import com.fbstore.member.entity.Member;
import com.fbstore.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by fabao on 2019/2/20.
 */
@RefreshScope
@RestController
public class MemberController {
    @Value("${hello}")
    String hello;
    @Autowired
    MemberService memberService;
    @RequestMapping("/getByName/{name}")
    private String getMemberByName(@Value("${hello}") String greetings,@PathVariable("name") String name, HttpServletRequest request){
        return greetings;
//        Member member=null;
//        return greetings+":"+ request.getServerPort()+":"+ memberService.getMemberByName(name).toString();
    }

}
