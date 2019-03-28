package com.biosh.account.service;

import com.biosh.dal.mapper.BizUserMapper;
import com.biosh.dal.model.BizUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private BizUserMapper mapper;

    public void addUser(BizUser user) {
        mapper.insertSelective(user);
    }
}
