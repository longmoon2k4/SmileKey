package com.he186065.smilekey.service;

import com.he186065.smilekey.model.User;
import com.he186065.smilekey.repository.UserRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepositiry userRepositiry;

    public UserService(UserRepositiry userRepositiry) {
        this.userRepositiry = userRepositiry;
    }

    public void saveUser(User user) {
        userRepositiry.save(user);
    }

    public void deleteUser(Long id) {
        userRepositiry.deleteById(id);
    }

    public Iterable<User> getAllUsers() {
        return userRepositiry.findAll();
    }

    public User getUserById(Long id) {
        Optional<User> optionalUser = userRepositiry.findById(id);
        return optionalUser.orElse(null);
    }
}
