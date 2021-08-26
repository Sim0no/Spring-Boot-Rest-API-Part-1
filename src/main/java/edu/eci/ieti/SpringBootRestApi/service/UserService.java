package edu.eci.ieti.SpringBootRestApi.service;

import edu.eci.ieti.SpringBootRestApi.data.User;

import java.util.List;

public interface UserService {
    User create(User user );

    User findById( String id );

    List<User> all();

    void deleteById( String id );

    User update( User user, String userId );
}