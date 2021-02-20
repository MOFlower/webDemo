package com.web.study.entity;

import lombok.Data;

@Data
public class QueryInfo {
    private String info="";
    private int pageNum = 1;
    private int pageSize = 1;
}
