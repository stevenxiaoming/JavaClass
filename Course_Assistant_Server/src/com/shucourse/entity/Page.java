/**
 * @Title: Page.java
 * @Package: com.shucourse.entity
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-16 下午10:09:09
 * @version V1.0
 */
package com.shucourse.entity;

import java.util.List;

/**
 * @author Steven Ming
 * @datetime 2017-2-16 下午10:09:09
 */
public class Page {
    private int currPage;   // 当前页
    private int pageSize = 30;   // 每页记录数，建议30
    private int totalCount; // 记录总数
    private int totalPage;  // 总页数
    private List<Course> list;
    public int getCurrPage() {
        return currPage;
    }
    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    public int getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
    public List<Course> getList() {
        return list;
    }
    public void setList(List<Course> list2) {
        this.list = list2;
    }
}
