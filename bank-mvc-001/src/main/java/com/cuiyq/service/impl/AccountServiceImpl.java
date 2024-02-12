package com.cuiyq.service.impl;

import com.cuiyq.dao.AccountDao;
import com.cuiyq.dao.impl.AccountDaoImpl;
import com.cuiyq.domain.Account;
import com.cuiyq.exceptions.AccountNotExitException;
import com.cuiyq.exceptions.AppException;
import com.cuiyq.exceptions.MoneyNotEnoughException;
import com.cuiyq.service.AccountService;

import java.sql.SQLException;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：
 */
@SuppressWarnings("all")
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao = new AccountDaoImpl();
//  写转账的业务逻辑代码，

    /**
     *
     * @param fromActno 转出的账户
     * @param toActno 转入的账户
     * @param money 金钱
     * @throws AccountNotExitException
     * @throws MoneyNotEnoughException
     */
    @Override
    public void transfer(String fromActno, String toActno, Double money) throws AccountNotExitException,MoneyNotEnoughException,AppException {

            //转账前判断账户是否存在
            if (accountDao.selectByActno(fromActno) == null) {
                throw new AccountNotExitException("账户不存在");
            }
//        判断余额是否足够
            Account fromAct = accountDao.selectByActno(fromActno); //生成转账前的对象

            if (fromAct.getBalance() < money) {
                throw new MoneyNotEnoughException("余额不足");
            }

            Account toAct = accountDao.selectByActno(toActno); //生成转账后的对象
//        开始转账
            fromAct.setBalance(fromAct.getBalance() - money);
            toAct.setBalance(toAct.getBalance() + money);
            int count = accountDao.update(fromAct);
            count += accountDao.update(toAct);
            if (count != 2) {
                throw new AppException("转账失败");
            }
            System.out.println("转账成功");

    }
}
