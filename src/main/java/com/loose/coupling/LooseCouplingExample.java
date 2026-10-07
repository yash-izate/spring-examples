package com.loose.coupling;

/*
                 UserDataProvider
                  <<interface>>
                       ▲
          ┌────────────┼─────────────┐
          │            │             │
 UserDatabaseProvider  │  WebServiceDataProvider
                       │
              NewDataBaseProvider
                       │
                       ▼
                  UserManager
 */

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        System.out.println("================================================");

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        System.out.println("================================================");

        UserDataProvider newServiceProvider = new NewDataBaseProvider();
        UserManager userManagerWithNS = new UserManager(newServiceProvider);
        System.out.println(userManagerWithNS.getUserInfo());
        System.out.println("================================================");

    }
}