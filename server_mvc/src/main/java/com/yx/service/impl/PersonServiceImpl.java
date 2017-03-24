package com.yx.service.impl;

import com.yx.service.PersonService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * User: LiWenC
 * Date: 17-3-24
 */
@Service
@WebService(endpointInterface = "com.yx.service.PersonService")
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
