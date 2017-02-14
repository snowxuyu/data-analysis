package com.personal.study.report.dto;

import java.util.List;

/**
 * 表格格式
 * <p>
 * Created by yinyafei on 2017/2/9.
 */
public class DataGrid {

    private long total;

    private List<Object> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<Object> getRows() {
        return rows;
    }

    public void setRows(List<Object> rows) {
        this.rows = rows;
    }
}
