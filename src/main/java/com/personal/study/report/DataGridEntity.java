package com.personal.study.report;

import java.util.List;

/**
 * 表格格式
 * <p>
 * Created by yinyafei on 2017/2/9.
 */
public class DataGridEntity {

    private int total;

    private List<Object> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Object> getRows() {
        return rows;
    }

    public void setRows(List<Object> rows) {
        this.rows = rows;
    }
}
