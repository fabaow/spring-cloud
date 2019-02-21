package com.fbstore.member.controller;

import com.fbstore.member.entity.Member;
import com.fbstore.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by fabao on 2019/2/20.
 */
@RestController
public class MemberController {
    @Autowired
    MemberService memberService;
    @RequestMapping("/getByName/{name}")
    private String getMemberByName(@PathVariable("name") String name, HttpServletRequest request){
        Member member=null;
        return request.getServerPort()+":"+ memberService.getMemberByName(name).toString();
    }

}
