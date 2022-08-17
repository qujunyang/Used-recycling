package com.qfedu.mtl.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 分页帮助类
 */
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PageInfo<T> {

    private int pageNum;
    private int pageCount;
    private int count;
    private int prePage;
    private int nextPage;
    private List<T> list;
    public static final int PAGE_SIZE=8;

}
