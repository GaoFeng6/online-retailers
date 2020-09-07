package com.gaofeng.gmall.service;

import com.gaofeng.gmall.bean.BaseAttrInfo;
import com.gaofeng.gmall.bean.BaseCatalog1;
import com.gaofeng.gmall.bean.BaseCatalog2;
import com.gaofeng.gmall.bean.BaseCatalog3;

import java.util.List;

public interface ManageService {
    List<BaseCatalog1> getCatalog1();

    List<BaseCatalog2> getCatalog2(String catalog1Id);

    List<BaseCatalog3> getCatalog3(String catalog2Id);

    List<BaseAttrInfo> getAttrList(String catalog3Id);
}
