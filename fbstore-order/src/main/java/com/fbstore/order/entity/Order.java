package com.fbstore.order.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {
    private String memberId;
    private double amount;
}
