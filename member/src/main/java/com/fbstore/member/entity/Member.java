package com.fbstore.member.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by fabao on 2019/2/20.
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Member {
    private String name;
    private String phoneNumber;
    private String address;
}
