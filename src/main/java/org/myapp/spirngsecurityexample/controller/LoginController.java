//package org.myapp.spirngsecurityexample.controller;
//
//import org.myapp.spirngsecurityexample.entity.User.DTOin;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/v2")
//public class LoginController {
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @PostMapping("/login")
//    public String userLogin(@RequestBody DTOin userDto){
//        UserDetails admin = User.withUsername(userDto.getUsername())
//                .password(passwordEncoder.encode(userDto.getPassword()))
//                .build();
//        return new InMemoryUserDetailsManager(admin).toString();
//    }
//}
