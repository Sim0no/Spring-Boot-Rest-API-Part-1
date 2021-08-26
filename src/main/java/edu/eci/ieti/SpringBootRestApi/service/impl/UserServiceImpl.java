package edu.eci.ieti.SpringBootRestApi.service.impl;

import edu.eci.ieti.SpringBootRestApi.data.User;
import edu.eci.ieti.SpringBootRestApi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    HashMap<String, User> map = new HashMap <String, User> ();


    @Override
    public User create(User user) {
        map.put(user.getId(),user);
        return user;
    }


    @Override
    public User findById(String id) {
        User result = map.get(id);

        return result;
    }

    @Override
    public List<User> all() {
        List<User> users = new ArrayList<>(map.values());
        return users;
    }

    @Override
    public void deleteById(String id) {

        map.remove(id);

    }

    @Override
    public User update(User user, String userId) {
        User value = null;

        if(map.containsKey(userId)){

            value = map.get(userId);

        }


        if(value == null){
            //Excepción
            return null;

        }
        return value;
    }
}
