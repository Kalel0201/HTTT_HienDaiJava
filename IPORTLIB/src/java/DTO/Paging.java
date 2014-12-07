package DTO;
public class Paging {
    private int pageIndex;
    private int pageSize;
    private Object obj;
    
    public Paging() {
    }

    public Paging(int pageIndex, int pageSize, Object obj) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.obj = obj;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
    
}
