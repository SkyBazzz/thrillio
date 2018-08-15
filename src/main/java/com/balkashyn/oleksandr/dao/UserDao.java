package com.balkashyn.oleksandr.dao;

import com.balkashyn.oleksandr.DataStore;
import com.balkashyn.oleksandr.entities.User;

public class UserDao {

    public User[] getUsers(){
        return DataStore.getUsers();
    }
}
