package service;

import model.User;

import java.util.List;

public interface UserService {

        void setUser (User user);
        User getById(int id);
        void deleteById(int id);
        List getAllUsers();



}
