package com.yx.test;

import com.yx.service.impl.PersonServiceImpl;
import com.yx.service.impl.PersonServiceImplService;

/**
 * 调用WebService的客户端
 * User: NMY
 * Date: 17-3-23
 */
public class WSClient {

    public static void main(String[] args) {
        //创建一个用于产生WebServiceImpl实例的工厂，WebServiceImplService类是wsimport工具生成的
        PersonServiceImplService factory = new PersonServiceImplService();
        //通过工厂生成一个WebServiceImpl实例，WebServiceImpl是wsimport工具生成的
        PersonServiceImpl service = factory.getPersonServiceImplPort();
        //调用WebService的sayHello方法
        String resResult = service.sayHello("孤傲苍狼");
        System.out.println("调用PersonService的sayHello方法返回的结果是：" + resResult);
        System.out.println("---------------------------------------------------");
        //调用WebService的save方法
        resResult = service.save("孤傲苍狼", "123");
        System.out.println("调用PersonService的save方法返回的结果是：" + resResult);
    }
}