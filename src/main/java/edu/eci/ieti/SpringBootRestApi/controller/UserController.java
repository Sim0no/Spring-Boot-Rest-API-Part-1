package edu.eci.ieti.SpringBootRestApi.controller;

import edu.eci.ieti.SpringBootRestApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/v1/user" )
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(@Autowired UserService userService )
    {
        this.userService = userService;
    }

}
