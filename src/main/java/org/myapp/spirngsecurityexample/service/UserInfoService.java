//package org.myapp.spirngsecurityexample.service;
//
//import lombok.RequiredArgsConstructor;
//import org.myapp.spirngsecurityexample.entity.User.UserEntity;
//import org.myapp.spirngsecurityexample.repository.UserRepository;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.Optional;
//
//@RequiredArgsConstructor
//public class UserInfoService implements UserDetailsService {
//    private final UserRepository userRepository;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<UserEntity> userInfo = userRepository.findByUsername(username);
//        if (userInfo.isPresent()) {
//            return (UserDetails) userInfo.get();
//        }
//        throw new UsernameNotFoundException(username);
//    }
//}
