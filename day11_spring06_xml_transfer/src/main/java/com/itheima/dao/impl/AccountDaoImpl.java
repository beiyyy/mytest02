package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.Reader;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Account findByName(String name) {
        Account account = jdbcTemplate.queryForObject("select * from account where name =?", new BeanPropertyRowMapper<>(Account.class),name);
        return account;
    }

    public void eidt(Account account) {
        jdbcTemplate.update("update account set name = ?,money =? where id=?",account.getName(),account.getMoney(),account.getId());
    }
}
