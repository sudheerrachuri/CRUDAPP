package com.cts.crudapp.repository;

import com.cts.crudapp.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
