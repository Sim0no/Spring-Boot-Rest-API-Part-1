package edu.eci.ieti.SpringBootRestApi.service;

import edu.eci.ieti.SpringBootRestApi.data.User;
import edu.eci.ieti.SpringBootRestApi.dto.UserDto;
import edu.eci.ieti.SpringBootRestApi.exception.UserException;

import java.util.List;

public interface UserService {
    User create(User user );

    User create(UserDto user ) throws UserException;

    User findById( String id ) throws UserException;

    List<User> all();

    User deleteById(String id ) throws UserException;

    User update( User user, String userId ) throws UserException;
    User update( UserDto user, String userId ) throws UserException;
}