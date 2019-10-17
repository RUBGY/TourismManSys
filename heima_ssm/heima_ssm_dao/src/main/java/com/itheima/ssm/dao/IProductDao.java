package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Hant
 * @create 2019-10-12-13:57
 */
public interface IProductDao {


    //根据id查询产品
    @Select("select * from product where id=#{productId}")
    public Product findById(String productId) throws Exception;

    /**
     * 查询所有的产品信息
     * @return
     */
    @Select("select * from product")
    public List<Product> findAll() throws Exception;

    //存储产品信息
    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
}
