package service;

import domain.character.Character;
import domain.character.GameCharacter;
import domain.character.GameCharacterAttributes;
import domain.map.MapLocation;
import domain.tendency.Tendency;

public class EntityManager {

    public EntityManager() {
    }

    public GameCharacterAttributes CreateGameCharacterAttributes(Character character) {

        //Attributes
        GameCharacterAttributes gameCharacterAttributes = new GameCharacterAttributes(character);
        gameCharacterAttributes.setHitPoint(character.getConstitution() * 10);
        gameCharacterAttributes.setSpeed(character.getDexterity());
        gameCharacterAttributes.setAttackPower(character.getStrength());
        gameCharacterAttributes.setArmor(character.getStrength());
        gameCharacterAttributes.setDodge(character.getDexterity());
        gameCharacterAttributes.setSpellPower(character.getIntelligence());
        gameCharacterAttributes.setSpellResistance(character.getIntelligence());
        return gameCharacterAttributes;
    }

    public GameCharacter CreateGameCharacter(GameCharacterAttributes gameCharacterAttributes, MapLocation mapLocation, Tendency tendency) {

        GameCharacter gameCharacter = new GameCharacter(gameCharacterAttributes, mapLocation, tendency);
        return gameCharacter;
    }

}
