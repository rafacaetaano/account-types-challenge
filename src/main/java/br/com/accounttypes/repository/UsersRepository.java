package br.com.accounttypes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.accounttypes.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

	@Query(value = "select u from Users u where u.id = ?1")
	public Users findUserByID(Long id);
	
}
