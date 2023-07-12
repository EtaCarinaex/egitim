package com.selenity.ngta.repository;

import com.selenity.ngta.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
}
