package com.he186065.smilekey.repository;

import com.he186065.smilekey.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositiry extends JpaRepository<User, Long> {
}
