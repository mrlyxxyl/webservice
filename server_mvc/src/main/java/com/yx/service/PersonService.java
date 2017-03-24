package com.yx.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * User: LiWenC
 * Date: 17-3-24
 */
@WebService(targetNamespace = "http://192.168.2.81:8001/server_mvc/wsdl")
public interface PersonService {
    @WebMethod
    String sayHello(String name);

    @WebMethod
    String save(String name, String pwd);
}
