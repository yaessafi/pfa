package ma.ensa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;

import ma.ensa.dao.AdminRepository;
import ma.ensa.entities.Admin;

@SpringBootApplication
//@EntityScan(basePackages = {"ma.ensa.entities","ma.ensa.dao"})
public class AmouguarApplication implements CommandLineRunner {
	@Autowired
	private AdminRepository adminrepository;
	public static void main(String[] args)  {
		 SpringApplication.run(AmouguarApplication.class, args);

	}

	
	public void run(String... args) throws Exception {
		
		adminrepository.save(new Admin("email@email.com","asmilony"));
		
	}

}
