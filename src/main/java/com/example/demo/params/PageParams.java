package com.example.demo.params;

public class PageParams {

    private Integer currentPage = 1;

    private Integer pageSize = 10;

    private String sortField = "id";

    private Integer sortModel = 1;

    public PageParams() {}

    public PageParams(Integer currentPage, Integer pageSize, String sortField, Integer sortModel) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.sortField = sortField;
        this.sortModel = sortModel;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public Integer getSortModel() {
        return sortModel;
    }

    public void setSortModel(Integer sortModel) {
        this.sortModel = sortModel;
    }

    @Override
    public String toString() {
        return "PageParams{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", sortField='" + sortField + '\'' +
                ", sortModel=" + sortModel +
                '}';
    }
}
