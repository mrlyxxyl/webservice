package com.yx.service.impl;

import com.yx.service.PersonService;

import javax.jws.WebService;

/**
 * User: NMY
 * Date: 17-3-23
 */
@WebService
public class PersonServiceImpl implements PersonService {
    @Override
    public String sayHello(String name) {
        System.out.println("PersonService sayHello " + name);
        return "sayHello " + name;
    }

    @Override
    public String save(String name, String pwd) {
        System.out.println("PersonService save " + name + "， " + pwd);
        return "save Success";
    }
}
