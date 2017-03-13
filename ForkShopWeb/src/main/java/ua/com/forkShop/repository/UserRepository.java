package ua.com.forkShop.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.forkShop.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
