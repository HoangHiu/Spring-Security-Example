package org.myapp.spirngsecurityexample.repository;

import org.myapp.spirngsecurityexample.entity.User.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity ,String> {
    Optional<UserEntity> findByUsername(String username);
}
