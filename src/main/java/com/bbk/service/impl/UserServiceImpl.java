package com.bbk.service.impl;

import com.bbk.dao.UserDao;
import com.bbk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List getAllUser() {
        List allUser = userDao.getAllUser();
        return allUser;
    }
}
