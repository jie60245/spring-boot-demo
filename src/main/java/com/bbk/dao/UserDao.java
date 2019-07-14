package com.bbk.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    //获得所有用户信息
    public List getAllUser();
    //新增一个修改接口
    public void updateUser();

    //删除
    public void shanchuer();

    public void shanchusan();

    public void chuangjianfenzhi2();
}
