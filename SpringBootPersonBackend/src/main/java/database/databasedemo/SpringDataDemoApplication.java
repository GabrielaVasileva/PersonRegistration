package database.databasedemo;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import database.databasedemo.entity.Person;
import database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonSpringDataRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        logger.info("User id 10001 -> {}", repository.findById(10001));

        logger.info("Inserting -> {}",
                repository.save(new Person("Tara", "V","tara@gmail.com", new Date("30/05/2000"))));

        logger.info("Inserting -> {}",
                repository.save(new Person("Mara", "F","mara@gmail.com" ,new Date("19/05/1983"))));


        logger.info("Inserting -> {}",
                repository.save(new Person("Lara", "S", "para@gmail.com",new Date("15/05/1950"))));
        logger.info("Inserting -> {}",
                repository.save(new Person("Sarah", "E", "sarah@gmail.com",new Date("03/05/1975"))));

//        logger.info("Update 10003 -> {}",
//                repository.save( new Person("Dara", "Q", "dara@gmail.com",new Date())));

        repository.deleteById(1);

        logger.info("All users -> {}", repository.findAll());
    }
}
