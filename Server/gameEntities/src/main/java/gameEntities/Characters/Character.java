package gameEntities.Characters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String characterName;
    protected long Strength;
    protected long Dexterity;
    protected long Constitution;
    protected long Intelligence;

    protected Character() {
    }

    public Character(String characterName, long strength, long dexterity, long constitution, long intelligence) {
        this.characterName = characterName;
        this.Strength = strength;
        this.Dexterity = dexterity;
        this.Constitution = constitution;
        this.Intelligence = intelligence;
    }

    public long getId() {
        return id;
    }

    public String GetCharacterName() {
        return characterName;
    }

    public long GetStrength() {
        return Strength;
    }

    public long GetDexterity() {
        return Dexterity;
    }

    public long GetConstitution() {
        return Constitution;
    }

    public long GetIntelligence() {
        return Intelligence;
    }

    @Override
    public String toString() {
        return String.format(
                "Character[id=%d, characterName='%s', strength='%d', dexterity='%d', constitution='%d', intelligence='%d']",
                id, characterName, Strength, Dexterity, Constitution, Intelligence);
    }

}