package service;

import domain.character.*;
import domain.character.Character;
import domain.game.GameInstanceRepository;
import domain.map.Location;
import domain.map.Map;
import domain.map.MapLocationRepository;
import domain.map.MapRepository;
import domain.tendency.Tendency;
import domain.tendency.TendencyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


public class Service {

    private static final Logger log = LoggerFactory.getLogger(Service.class);

    private CharacterRepository characterRepository;
    private GameCharacterRepository gameCharacterRepository;
    private GameCharacterAttributesRepository gameCharacterAttributesRepository;
    private MapLocationRepository mapLocationRepository;
    private MapRepository mapRepository;
    private TendencyRepository tendencyRepository;
    private GameInstanceRepository gameInstanceRepository;

    public Service() {

    }

    public Service(CharacterRepository characterRepository,
                   MapRepository mapRepository,
                   MapLocationRepository mapLocationRepository,
                   TendencyRepository tendencyRepository,
                   GameCharacterAttributesRepository gameCharacterAttributesRepository,
                   GameCharacterRepository gameCharacterRepository) {
        this.characterRepository = characterRepository;
        this.mapRepository = mapRepository;
        this.mapLocationRepository = mapLocationRepository;
        this.tendencyRepository = tendencyRepository;
        this.gameCharacterAttributesRepository = gameCharacterAttributesRepository;
        this.gameCharacterRepository = gameCharacterRepository;
    }


    public void Test() {

        //Create entities
        Character character1 = new Character("Tortoise", 10, 1, 9, 1);
        Character character2 = new Character("Monkey", 1, 10, 5, 5);
        Character character3 = new Character("Ball", 5, 1, 5, 10);

        Map test_map = new Map("TestMap", 64, 64);

        Location location1 = new Location(test_map, 1, 1);
        Location location2 = new Location(test_map, 64, 64);
        Location location3 = new Location(test_map, 32, 32);

        Tendency melee_tendency = new Tendency("melee", true, false);
        Tendency range_tendency = new Tendency("range", true, false);

        EntityManager entityManager = new EntityManager();
        GameCharacterAttributes gameCharacterAttributes1 = entityManager.CreateGameCharacterAttributes(character1);
        GameCharacterAttributes gameCharacterAttributes2 = entityManager.CreateGameCharacterAttributes(character2);
        GameCharacterAttributes gameCharacterAttributes3 = entityManager.CreateGameCharacterAttributes(character3);
        GameCharacter gameCharacter1 = entityManager.CreateGameCharacter(gameCharacterAttributes1, location1, melee_tendency);
        GameCharacter gameCharacter2 = entityManager.CreateGameCharacter(gameCharacterAttributes2, location2, melee_tendency);
        GameCharacter gameCharacter3 = entityManager.CreateGameCharacter(gameCharacterAttributes3, location3, range_tendency);

        // save a couple of characters
        SaveCharacter(character1);
        SaveCharacter(character2);
        SaveCharacter(character3);

        SaveMap(test_map);
        SaveMapLocation(location1);
        SaveMapLocation(location2);
        SaveMapLocation(location3);

        SaveTendency(melee_tendency);
        SaveTendency(range_tendency);

        SaveGameCharacterAttributes(gameCharacterAttributes1);
        SaveGameCharacterAttributes(gameCharacterAttributes2);
        SaveGameCharacterAttributes(gameCharacterAttributes3);

        SaveGameCharacter(gameCharacter1);
        SaveGameCharacter(gameCharacter2);
        SaveGameCharacter(gameCharacter3);

        //Path finding test

        // fetch all characters
/*        log.info("Character found with findAll():");
        log.info("-------------------------------");
        for (Character character : characterRepository.findAll()) {
            log.info(character.toString());
        }
        log.info("");

        log.info("Map Location found with findAll():");
        log.info("-------------------------------");
        for(Location location : mapLocationRepository.findAll()) {
            log.info(location.toString());
        }
        log.info("");

        log.info("Character Attributes found with findAll():");
        log.info("-------------------------------");
        for(GameCharacterAttributes gameCharacterAttributes : gameCharacterAttributesRepository.findAll()) {
            log.info(gameCharacterAttributes.toString());
        }
        log.info("");

        log.info("Game Character found with findAll():");
        log.info("-------------------------------");
        for(GameCharacter gameCharacter : gameCharacterRepository.findAll()) {
            log.info(gameCharacter.toString());
        }
        log.info("");*/

/*        // fetch an individual character by ID
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
        log.info("");*/
    }

    public void SaveCharacter(Character character) {
        characterRepository.save(character);
    }

    public void SaveMap(Map map) {
        mapRepository.save(map);
    }

    public void SaveMapLocation(Location location){
        mapLocationRepository.save(location);
    }

    public void SaveTendency(Tendency tendency) {
        tendencyRepository.save(tendency);
    }

    public void SaveGameCharacterAttributes(GameCharacterAttributes gameCharacterAttributes){
        gameCharacterAttributesRepository.save(gameCharacterAttributes);
    }

    public void SaveGameCharacter(GameCharacter gameCharacter){
        gameCharacterRepository.save(gameCharacter);
    }

    public Character LoadCharacter(long id)
    {
        Character character = characterRepository.findById(id).get();
        return character;
    }

    public GameCharacter LoadGameCharacter(long id)
    {
        GameCharacter gameCharacter = gameCharacterRepository.findById(id).get();
        return gameCharacter;
    }

}
