package com.springmvc.service.impl;

import com.springmvc.service.PersonServer;
import org.springframework.stereotype.Service;

/**
 * Created by zhoubo on 7/28/2017.
 */
@Service
public class PersonServerImpl  implements PersonServer {

    @Override
    public void save(String uname, int age) {

        int a=1;
        age= age/2;//打开上面两行报错，可触发异常通知
        System.out.println("come in personServerImpl save method...");
    }
}
