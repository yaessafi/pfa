package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
