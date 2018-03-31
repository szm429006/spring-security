package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.params.PageParams;
import com.example.demo.params.UserParams;
import com.fasterxml.jackson.annotation.JsonView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/passport/user")
public class UserController {

    protected static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "test api";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @JsonView(User.UserSimpleView.class)
    public List<User> search(UserParams userParams, PageParams pageParams) {
        List<User> users = new ArrayList<User>();
        logger.info(userParams.toString());
        logger.info(pageParams.toString());
        users.add(new User("a", "123"));
        users.add(new User("b", "123"));
        users.add(new User("c", "123"));
        return users;
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @JsonView(User.UserDetailView.class)
    public User detail(UserParams userParams) {
        logger.info(userParams.toString());
        User user = new User("a","123");
        return user;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public User add(@Valid User user, BindingResult errors) {
        logger.error(errors.toString());
        logger.info(user.toString());
        return user;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public User edit(@Valid User user) {
        logger.info(user.toString());
        return user;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public User delete(User user) {
        logger.info(user.toString());
        return user;
    }
}
