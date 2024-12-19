package com.example.boardmysql.repository;

import com.example.boardmysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<User, Integer> {

}
