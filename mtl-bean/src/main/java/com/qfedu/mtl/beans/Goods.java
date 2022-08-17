package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Goods {
    private int goodsId;
    private String goodsName;
    private String goodsImg;
    private int goodsCost;
    private int goodsMinPrice;
}
