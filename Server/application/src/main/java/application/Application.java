package application;

import domain.character.CharacterRepository;
import domain.character.GameCharacterAttributesRepository;
import domain.character.GameCharacterRepository;
import domain.map.MapLocationRepository;
import domain.map.MapRepository;
import domain.tendency.TendencyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import service.Service;

@SpringBootApplication
@EntityScan({"domain.character", "domain.map", "domain.tendency"})
@EnableJpaRepositories({"domain.character", "domain.map", "domain.tendency"})
@EnableWebMvc
@Import(rest.GreetingController.class)
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(CharacterRepository characterRepository,
								  MapRepository mapRepository,
								  MapLocationRepository mapLocationRepository,
								  TendencyRepository tendencyRepository,
								  GameCharacterAttributesRepository gameCharacterAttributesRepository,
								  GameCharacterRepository gameCharacterRepository) {
		return (args) -> {

			Service service = new Service(characterRepository,
					mapRepository,
					mapLocationRepository,
					tendencyRepository,
					gameCharacterAttributesRepository,
					gameCharacterRepository);

			service.Test();

		};
	}

}
