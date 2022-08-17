package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Brand implements Serializable {
    private Integer brandId;
    private String brandName;
    private String brandLogo;
    private String brandDesc;
    private Date brandCreateTime;
    private Integer brandStatus;
}
