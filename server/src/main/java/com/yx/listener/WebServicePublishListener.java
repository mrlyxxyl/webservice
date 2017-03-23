package com.yx.listener;

import com.yx.service.impl.PersonServiceImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.ws.Endpoint;

/**
 * 用于发布WebService的监听器
 * User: NMY
 * Date: 17-3-23
 */
//@WebListener
public class WebServicePublishListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String address = "http://192.168.1.101:8989/ws_server/PersonService";
        Endpoint.publish(address, new PersonServiceImpl());
        System.out.println("使用WebServicePublishListener发布webservice成功!");
    }
}