package com.cuiyq.web;

import com.cuiyq.exceptions.AccountNotExitException;
import com.cuiyq.exceptions.AppException;
import com.cuiyq.exceptions.MoneyNotEnoughException;
import com.cuiyq.service.AccountService;
import com.cuiyq.service.impl.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：
 * 账户小程序
 *  * AccountServlet是一个司令官。他负责调度其他组件来完成任务。
 */
@WebServlet("/accountServlet")
public class AccountServlet extends HttpServlet {
    AccountService accountService = new AccountServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AccountServlet");
       String fromActno = req.getParameter("fromActno");
       String toActno = req.getParameter("toActno");
       Double money = Double.parseDouble(req.getParameter("money"));

//        调用model处理业务，
        try {
            accountService.transfer(fromActno, toActno, money);
        } catch (AccountNotExitException e) {
            resp.sendRedirect(req.getContextPath() + "/AccountNotExit.jsp");
        } catch (MoneyNotEnoughException e) {
            resp.sendRedirect(req.getContextPath() + "/moneynotenough.jsp");
        } catch (AppException e) {
            resp.sendRedirect(req.getContextPath() + "/error.jsp");
        }
        ;
    }
}
