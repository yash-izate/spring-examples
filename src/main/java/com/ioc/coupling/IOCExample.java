package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIocLooseCoupling.xml");

//        UserDataProvider databaseProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDB = new UserManager(databaseProvider);

        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        System.out.println("================================================");

//        UserDataProvider webServiceProvider = new WebServiceDataProvider();
//        UserManager userManagerWithWS = new UserManager(webServiceProvider);

        UserManager userManagerWithWS = (UserManager) context.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWS.getUserInfo());

        System.out.println("================================================");

//        UserDataProvider newServiceProvider = new NewDataBaseProvider();
//        UserManager userManagerWithNS = new UserManager(newServiceProvider);

        UserManager userManagerWithNS = (UserManager) context.getBean("userManagerWithNewDataBaseProvider");
        System.out.println(userManagerWithNS.getUserInfo());
        System.out.println("================================================");

    }
}