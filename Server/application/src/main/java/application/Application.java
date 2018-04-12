package application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

/*	@Bean
	public CommandLineRunner demo(CharacterRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new GameCharacter("Tortoise", 10,1,9,1));
			repository.save(new GameCharacter("Monkey", 1,10,5,5));
			repository.save(new GameCharacter("Ball", 5,1,5,10));

			// fetch all customers
			log.info("Character found with findAll():");
			log.info("-------------------------------");
			for (GameCharacter character : repository.findAll()) {
				log.info(character.toString());
			}
			log.info("");

			GameCharacter gc1 = repository.findById(1L).get();
			GameCharacter gc2 = repository.findById(2L).get();
			GameCharacter gc3 = repository.findById(3L).get();

			Battle battle = new Battle();
			GameCharacter winner1 = battle.Begin(gc1, gc2);
			GameCharacter winner2 = battle.Begin(gc3, winner1);

			log.info(String.format("%s is the winner!", winner2.GetCharacterName()));
			log.info("");

			// fetch an individual customer by ID
*//*			repository.findById(1L)
				.ifPresent(character -> {
					log.info("Character found with findById(1L):");
					log.info("--------------------------------");
					log.info(character.toString());
					log.info("");
				});*//*

			// fetch customers by last name
*//*			log.info("Character found with findByCharacterName('Tortoise'):");
			log.info("--------------------------------------------");
			repository.findByCharacterName("Tortoise").forEach(tortoise -> {
				log.info(tortoise.toString());
			});
			log.info("");*//*
		};
	}*/

}
