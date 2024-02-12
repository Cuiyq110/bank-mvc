package com.cuiyq.service;

import com.cuiyq.exceptions.AccountNotExitException;
import com.cuiyq.exceptions.AppException;
import com.cuiyq.exceptions.MoneyNotEnoughException;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：
 */
public interface AccountService {
    void transfer(String fromActno, String toActno, Double money) throws AccountNotExitException, MoneyNotEnoughException, AppException;
}
