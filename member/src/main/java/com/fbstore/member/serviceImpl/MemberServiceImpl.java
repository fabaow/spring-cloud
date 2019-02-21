package com.fbstore.member.serviceImpl;

import com.fbstore.member.dao.MemberDao;
import com.fbstore.member.entity.Member;
import com.fbstore.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberDao memberDao;

    @Override
    public Member getMemberByName(String memberName) {
        return memberDao.getMemberByname(memberName);
    }
}
