package com.bean.demobean;

import java.util.ArrayList;
import java.util.List;


public class UserService{
    public  List<User> createUsersAndGetList(){
        List<User> list = new ArrayList<>();
        list.add( new User("Kabita"));
        list.add( new User("Pramesh"));
        list.add( new User("Bhattarai"));
        return list;
    }
}
