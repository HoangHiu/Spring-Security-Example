package org.myapp.spirngsecurityexample.service;

import org.myapp.spirngsecurityexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    @Autowired
    UserRepository userRepository;
}
