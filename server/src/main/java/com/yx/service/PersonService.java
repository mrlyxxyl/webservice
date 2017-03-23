package com.yx.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * User: NMY
 * Date: 17-3-23
 */
@WebService
public interface PersonService {
    @WebMethod
    String sayHello(String name);

    @WebMethod
    String save(String name, String pwd);
}
