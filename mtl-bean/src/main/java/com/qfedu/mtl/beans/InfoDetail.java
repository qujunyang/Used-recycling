package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InfoDetail {

    private int infoDetailId;
    private String infoDetailName;
    private String infoDetailDesc;

}
