package database.databasedemo;

import database.databasedemo.entity.Person;
import database.databasedemo.jdbc.PersonJbdcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJbdcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


//		logger.info("User id 1 -> {}", dao.findById(1));
//
//		logger.info("Deleting 2 -> No of Rows Deleted - {}",
//				dao.deleteById(2));
//
		logger.info("Inserting 10004 -> {}",
				dao.insert(new Person(10004,"Vara", "P","vara@gmail.com", new Date())));

		logger.info("Update 10003 -> {}",
				dao.update(new Person(10003,"Kara", "O","kara@gmail.com" ,new Date())));
		logger.info("All users -> {}", dao.findAll());

	}
}
