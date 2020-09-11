package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String from, String out, Float money) {
        //查询
        Account fromaccount = accountDao.findByName(from);
        Account outaccount = accountDao.findByName(out);

        //修改金额
        fromaccount.setMoney(fromaccount.getMoney()-money);
        outaccount.setMoney(outaccount.getMoney()+money);

        //将数据存入数据库
        accountDao.eidt(fromaccount);
        int a=1/0;
        accountDao.eidt(outaccount);
    }
}
