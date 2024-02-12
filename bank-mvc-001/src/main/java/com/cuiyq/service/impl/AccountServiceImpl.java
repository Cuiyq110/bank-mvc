package com.cuiyq.service.impl;

import com.cuiyq.dao.AccountDao;
import com.cuiyq.dao.impl.AccountDaoImpl;
import com.cuiyq.exceptions.AccountNotExitException;
import com.cuiyq.service.AccountService;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：
 */
@SuppressWarnings("all")
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao = new AccountDaoImpl();
//  写转账的业务逻辑代码，
    @Override
    public void transfer(String fromActno, String toActno, Double money) throws AccountNotExitException{
        //转账前判断账户是否存在
        if (accountDao.selectByActno(fromActno) == null) {
            throw new AccountNotExitException("账户不存在");
        }
//        判断余额是否足够

    }
}
