一、server端可以通过Java程序启动，也可以通过web启动，具体server程序中有描述
二、client开发：
    1、借助jdk的wsimort.exe工具生成客户端代码
    2、wsimport -keep url(url为wsdl文件的路径)生成客户端代码。
        eg：url：http://192.168.1.101:8989/ws_server/PersonService?wsdl
    3、打开命令行窗口，切换到客户端src目录，上面2命令生成客户端代码
    4、wsimport工具帮我们生成了好几个java类，但我们只需要关心PersonServiceImplService类和PersonServiceImpl接口的使用即可，
        具体在客户端程序的WSClient.java中所示
    5、运行WSClient的main方法，既可以看到调用service程序成功！