package com.cuiyq.test;

import com.cuiyq.dao.AccountDao;
import com.cuiyq.dao.impl.AccountDaoImpl;
import com.cuiyq.domain.Account;
import org.junit.Test;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：
 */
public class AccountTest {
    @Test
    public void test1() {
        AccountDao accountDao = new AccountDaoImpl();
//        Account account = new Account("test1",Double.valueOf(100));
        Account account = new Account();
        account.setActno("test1");
        account.setBalance(Double.valueOf(100));
        if (accountDao.insert(account) > 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("没有对数据库操作");
        }
    }
}
