package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Category {

    private int categoryId;
    private String categoryName;
    private String categoryIcon;
    private String categoryStatus;

}
