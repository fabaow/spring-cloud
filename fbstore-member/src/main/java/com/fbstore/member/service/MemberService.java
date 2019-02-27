package com.fbstore.member.service;

import com.fbstore.member.dao.MemberDao;
import com.fbstore.member.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fabao on 2019/2/20.
 */

public interface MemberService {
    public Member getMemberByName(String memberName);
}
