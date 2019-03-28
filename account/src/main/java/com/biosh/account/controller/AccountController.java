package com.biosh.account.controller;

import com.biosh.account.service.AccountService;
import com.biosh.dal.model.BizUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 用户登录
     * @return 返回登录成功的令牌Token
     */
    @GetMapping("/user/login")
    public Object AccountController() {
        BizUser user = new BizUser();
        user.setCreatedAt(new Date());
        user.setMobile("18702503794");
        user.setUsername("lanbomkong");
        user.setPassword("11030");
        accountService.addUser(user);
        return "hey gays!";
    }
}
