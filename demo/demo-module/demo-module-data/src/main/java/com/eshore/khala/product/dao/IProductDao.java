package com.eshore.khala.product.dao;

import java.util.List;

import com.eshore.khala.common.model.PageConfig;
import com.eshore.khala.core.data.api.dao.IBaseDao;
import com.eshore.khala.product.pojo.Product;
/**
*generated by tools 
*
*/
public interface IProductDao extends IBaseDao<Product> {
    public List<Product> queryPage(Product product, PageConfig pageConfig);
    
    public List<Product> queryPageExt(Product product, PageConfig pageConfig);
}