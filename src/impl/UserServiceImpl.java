package impl;

import com.compamy.MyException;
import dao.UserDao;
import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {


    private UserDao userDao = new UserDao();


    @Override
    public void setUser(User user) {

        userDao.getUsers().add(user);
    }

    @Override
    public User getById(int id) {

        User user1 = null;

        for (User user : userDao.getUsers()) {
            if (user.getId() == id) {
                user1 = user;
            } else {
                throw new MyException("Такого id нет ಠಿ_ಠ)");
            }
        }
        return user1;
    }

    @Override
    public void deleteById(int id) {

        for (User user : userDao.getUsers()) {
            if (user.getId() == id) {
                userDao.getUsers().remove(user);
            } else if (user.getId() != id){
                throw new MyException("Такого id нет ಠಿ_ಠ)");
            }
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getUsers();
    }
}

