package com.cuiyq.web;

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

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AccountServlet");
    }
}
