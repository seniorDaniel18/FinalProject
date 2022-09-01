package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {


    ArrayList<User> users = new ArrayList<>();

    public UserDao() {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }


}

