package com.graduation.base;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = -269324851606000815L;
    /**
     * 查询页码
     */
    private Integer pageNum = 1;

    /**
     * 查询总页数
     */
    private Integer pageCount = 1;

    /**
     * 查询总记录数
     */
    private Integer rowCount = 0;

    /**
     * 查询结果集
     */
    private List<T> entityList;

    public PageResult<T> setEntityList(List<T> entityList) {
        this.entityList = entityList;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public List<T> getEntityList() {
        return entityList;
    }
}
