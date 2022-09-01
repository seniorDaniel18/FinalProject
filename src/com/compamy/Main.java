package com.compamy;

import impl.UserServiceImpl;
import model.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Даниель", 18, Gender.MALE);
        User user2 = new User(2, "Сыймык", 21, Gender.MALE);
        User user3 = new User(3, "Мээрим", 19, Gender.FAMALE);


        UserServiceImpl userService = new UserServiceImpl();

        userService.setUser(user1);  // засунул в UserDao
        userService.setUser(user2);
        userService.setUser(user3);

        System.out.println();

        try {
            System.out.println("user с id 1 " + userService.getById(1));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("все user'ы " + userService.getAllUsers());

        System.out.println();

        System.out.println("Без Сыймыка ");
       try{
           userService.deleteById(2);
       }catch(MyException e){
           System.out.println(e.getMessage());
       }
        System.out.println(userService.getAllUsers());

    }
}