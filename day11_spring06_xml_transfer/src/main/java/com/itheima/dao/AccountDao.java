package com.itheima.dao;

import com.itheima.domain.Account;

public interface AccountDao {
    Account findByName(String name);

    void eidt(Account account);
}
