package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}
