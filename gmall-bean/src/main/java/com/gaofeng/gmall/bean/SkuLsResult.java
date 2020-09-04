package com.gaofeng.gmall.bean;

import java.io.Serializable;
import java.util.List;

public class SkuLsResult implements Serializable {

    // skuLsInfo 集合
    List<SkuLsInfo> skuLsInfoList;
    // 总条数
    long total;
    // 总页数
    long totalPages;
    // 获取平台属性值id集合：为了能够在页面渲染出平台属性名，平台属性值名称
    List<String> attrValueIdList;

    public List<SkuLsInfo> getSkuLsInfoList() {
        return skuLsInfoList;
    }

    public void setSkuLsInfoList(List<SkuLsInfo> skuLsInfoList) {
        this.skuLsInfoList = skuLsInfoList;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public List<String> getAttrValueIdList() {
        return attrValueIdList;
    }

    public void setAttrValueIdList(List<String> attrValueIdList) {
        this.attrValueIdList = attrValueIdList;
    }
}
