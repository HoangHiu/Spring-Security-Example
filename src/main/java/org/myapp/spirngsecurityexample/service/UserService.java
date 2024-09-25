//package org.myapp.spirngsecurityexample.service;
//
//import org.myapp.spirngsecurityexample.entity.User.UserEntity;
//import org.myapp.spirngsecurityexample.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService{
//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//    public UserEntity postUser(UserEntity user){
//        UserEntity userInfo = new UserEntity();
//        userInfo.setUsername(user.getUsername());
//        userInfo.setPassword(passwordEncoder.encode(user.getPassword()));
//        userInfo.setRole(user.getRole());
//        userRepository.save(userInfo);
//        return user;
//    }
//}
