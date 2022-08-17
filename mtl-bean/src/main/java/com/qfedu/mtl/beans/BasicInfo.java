package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BasicInfo {
    private int basicInfoId;
    private String basicInfoName;
    private int basicInfoStatus;
    private int basicInfoStep;
    private List<InfoDetail> infoDetailList;

}
