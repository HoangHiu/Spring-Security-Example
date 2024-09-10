package org.myapp.spirngsecurityexample.repository;

import org.myapp.spirngsecurityexample.entity.User.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity ,String> {
}
