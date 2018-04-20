package service;

import domain.character.Character;
import domain.character.CharacterRepository;
import domain.character.GameCharacterAttributesRepository;
import domain.character.GameCharacterRepository;
import domain.game.GameInstanceRepository;
import domain.map.Map;
import domain.map.MapLocationRepository;
import domain.map.MapRepository;
import domain.tendency.TendencyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Service {

    private static final Logger log = LoggerFactory.getLogger(Service.class);

    private CharacterRepository characterRepository;
    private GameCharacterRepository gameCharacterRepository;
    private GameCharacterAttributesRepository gameCharacterAttributesRepository;
    private MapLocationRepository mapLocationRepository;
    private MapRepository mapRepository;
    private TendencyRepository tendencyRepository;
    private GameInstanceRepository gameInstanceRepository;

    public Service(){

    }

    public Service(CharacterRepository characterRepository,
                   MapRepository mapRepository,
                   MapLocationRepository mapLocationRepository,
                   TendencyRepository tendencyRepository){
        this.characterRepository = characterRepository;
        this.mapRepository = mapRepository;
        this.mapLocationRepository = mapLocationRepository;
        this.tendencyRepository = tendencyRepository;
    }


    public void Test() {
        // save a couple of characters
        SaveCharacter(new Character("Tortoise", 10, 1, 9, 1));
        SaveCharacter(new Character("Monkey", 1, 10, 5, 5));
        SaveCharacter(new Character("Ball", 5, 1, 5, 10));

        // fetch all characters
        log.info("Character found with findAll():");
        log.info("-------------------------------");
        for (Character character : characterRepository.findAll()) {
            log.info(character.toString());
        }
        log.info("");

        // fetch an individual character by ID
        characterRepository.findById(1L)
                .ifPresent(character -> {
                    log.info("Character found with findById(1L):");
                    log.info("--------------------------------");
                    log.info(character.toString());
                    log.info("");
                });

        // fetch characters by last name
        log.info("Character found with findByCharacterName('Tortoise'):");
        log.info("--------------------------------------------");
        characterRepository.findByCharacterName("Tortoise").forEach(tortoise -> {
            log.info(tortoise.toString());
        });
        log.info("");
    }


    public void SaveCharacter(Character character){
        characterRepository.save(character);
    }

    public void SaveMap(Map map){
        mapRepository.save(map);
    }

}
