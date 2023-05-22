package com.deloitte.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.banking.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//
//	//trying
//	@Query(value="Select u From User u where u.username = : name")
//	public User findbyusername(@Param("name") String username);

	@Query(value="Select u From User u where u.username like %:name%")
	public User findbyusername(@Param("name") String username);

	@Query(value = "Select u From User u where u.password like %:name%")
	public User findbypassword(@Param("name") String username);

}
