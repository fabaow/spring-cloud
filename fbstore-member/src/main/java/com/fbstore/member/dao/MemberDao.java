package com.fbstore.member.dao;

import com.fbstore.member.entity.Member;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabao on 2019/2/20.
 */
@Component
public class MemberDao {
    List<Member> members;
    public MemberDao(){
        members=new ArrayList<>();
        members.add(new Member("1","Tom","333","shanghai"));
        members.add(new Member("2","Jack","222","newyork"));
    }
    public  Member getMemberByname(String name){
        Member retMem=null;
        for(Member m:members){
           if(m.getName().equals(name)){
               retMem=m;
           }
        }
        return retMem;
    }
}
