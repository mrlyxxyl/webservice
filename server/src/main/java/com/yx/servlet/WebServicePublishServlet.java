package com.yx.servlet;

import com.yx.service.impl.PersonServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.xml.ws.Endpoint;

/**
 * 用于发布WebService的Servlet
 * User: NMY
 * Date: 17-3-23
 */
@WebServlet(value = "", loadOnStartup = 0)
public class WebServicePublishServlet extends HttpServlet {

    public void init() throws ServletException {
        String address = "http://192.168.1.101:8989/ws_server/PersonService";
        Endpoint.publish(address, new PersonServiceImpl());
        System.out.println("使用WebServicePublishServlet发布webservice成功!");
    }
}