package com.balkashyn.oleksandr.services;

import com.balkashyn.oleksandr.dao.UserDao;
import com.balkashyn.oleksandr.entities.User;

public class UserService {
    private static UserService instance;
    private static UserDao userDao = new UserDao();

    private UserService() {
    }

    public static UserService getInstance() {
        instance = instance == null ? new UserService() : instance;
        return instance;
    }

    public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
                           String userType) {
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setGender(gender);
        user.setUserType(userType);

        return user;
    }

    public User[] getUsers(){
        return userDao.getUsers();
    }
}
