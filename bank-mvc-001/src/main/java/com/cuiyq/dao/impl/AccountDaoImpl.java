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
        return super.update("insert into account values (null,?, ?)",account.getActno(),account.getBalance());
    }

    @Override
    public int update(Account account) {
        return super.update("update account set balance=? where actno=?",account.getBalance(),account.getActno());
    }

    @Override
    public int delete(Integer id) {
        return super.update("delete from account where id=?",id);
    }

    @Override
    public Account selectByActno(String actno) {
        return super.querySingle("select * from account where actno=?",Account.class,actno);
    }

    @Override
    public List<Account> selectAll() {
        return null;
    }
}
