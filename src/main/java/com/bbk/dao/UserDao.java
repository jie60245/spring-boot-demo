package com.bbk.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    //获得所有用户信息
    public List getAllUser();
}
