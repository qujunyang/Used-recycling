package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

    private String orderId;
    private int userId;
    private int orderTotalPrice;
    private String userAddr;
    private String userName;
    private String userTel;
    private Date createTime;
    private String orderDesc;
    private int retrieveType;
    private String payName;
    private String payAccount;
    private int orderStatus;
    private String sendLogisticsName;
    private String sendLogisticsId;
    private String orderProcessor;
    private String backText;
    private String backLogisticsName;
    private String backLogisticsId;

}
