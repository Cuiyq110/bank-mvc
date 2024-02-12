package com.cuiyq.dao.impl;

import com.cuiyq.dao.AccountDao;
import com.cuiyq.dao.BasicDao;
import com.cuiyq.domain.Account;

import java.util.List;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：
 */
public class AccountDaoImpl extends BasicDao<Account> implements AccountDao {

    @Override
    public int insert(Account account) {
        return super.update("insert into accout values (null,?, ?)",account.getActno(),account.getBalance());
    }

    @Override
    public int update(Account account) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    @Override
    public Account selectByActno(String actno) {
        return null;
    }

    @Override
    public List<Account> selectAll() {
        return null;
    }
}
