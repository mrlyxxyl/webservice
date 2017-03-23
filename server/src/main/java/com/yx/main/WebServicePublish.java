package com.yx.main;

import com.yx.service.impl.PersonServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * 发布Web Service
 * User: NMY
 * Date: 17-3-23
 */
public class WebServicePublish {

    public static void main(String[] args) {
        //URL地址格式为：http://ip:port/xxxx
        String address = "http://192.168.1.101:8989/ws_server/PersonService";
        Endpoint.publish(address, new PersonServiceImpl());
        System.out.println("发布webservice成功!");
    }
}