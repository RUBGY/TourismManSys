package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @author Hant
 * @create 2019-10-17-14:14
 */
public interface IMemberDao {

    //根据id查询产品
    @Select("select * from member where id=#{memberId}")
    public Member findById(String memberId) throws Exception;
}
