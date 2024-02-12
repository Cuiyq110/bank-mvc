package com.cuiyq.dao;

import com.cuiyq.domain.Account;

import java.util.List;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：对account表进行增删改查
 */
public interface AccountDao {
//    增加一条数据
    int insert(Account account);
//    修改数据
    int update(Account account);
//    根据id删除数据
    int delete(Integer id);

//    查询单列
    Account selectByActno(String actno);

//    查询所有数据
    List<Account> selectAll();
}
