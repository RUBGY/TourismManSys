package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

/**
 * @author Hant
 * @create 2019-10-12-15:32
 */
public interface IProductService {

    public List<Product> findAll() throws Exception;

    public void save(Product product) throws Exception;
}
