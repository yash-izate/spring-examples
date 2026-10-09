package com.ioc.coupling;

public class NewDataBaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "Fetching User Details from new service provider";
    }
}