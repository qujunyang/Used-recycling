package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderItem {
    private int itemId;
    private String orderId;
    private int goodsId;
    private String goodsName;
    private String goodsImg;
    private String goodsInfo;
    private int goodsPrice;
    private int isComment;
}
