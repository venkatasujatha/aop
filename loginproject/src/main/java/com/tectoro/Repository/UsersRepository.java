package com.tectoro.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.Model.Users;
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	Optional<Users> findByLoginAndPassword(String login,String password);

}
