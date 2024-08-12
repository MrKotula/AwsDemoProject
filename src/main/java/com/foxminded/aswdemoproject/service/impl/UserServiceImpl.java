package com.foxminded.aswdemoproject.service.impl;

import com.foxminded.aswdemoproject.model.User;
import com.foxminded.aswdemoproject.repository.UserRepository;
import com.foxminded.aswdemoproject.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
