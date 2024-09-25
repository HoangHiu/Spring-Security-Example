//package org.myapp.spirngsecurityexample.controller;
//
//import org.myapp.spirngsecurityexample.entity.Book.BookEntity;
//import org.myapp.spirngsecurityexample.entity.User.UserEntity;
//import org.myapp.spirngsecurityexample.service.BookService;
//import org.myapp.spirngsecurityexample.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/v2/users")
//public class UserController {
//    @Autowired
//    UserService userService;
//
//    @GetMapping(value = "")
//    public ResponseEntity<UserDetails> getUser(
//            @RequestBody UserEntity userInfo
//    ){
//        return ResponseEntity.ok((UserDetails) userInfo);
//    }
//
//    @PostMapping(value = "")
//    public ResponseEntity<UserEntity> postUsers(
//            @RequestBody UserEntity userInfo
//    ){
//        return ResponseEntity.ok(userService.postUser(userInfo));
//    }
//
//
//}
