package domain.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String characterName;
    private long Strength;
    private long Dexterity;
    private long Constitution;
    private long Intelligence;

    protected Character() {
    }

    public Character(String characterName, long strength, long dexterity, long constitution, long intelligence) {
        this.characterName = characterName;
        this.Strength = strength;
        this.Dexterity = dexterity;
        this.Constitution = constitution;
        this.Intelligence = intelligence;
    }

/*    public Long getId() {
        return id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public long getStrength() {
        return Strength;
    }

    public long getDexterity() {
        return Dexterity;
    }

    public long getConstitution() {
        return Constitution;
    }

    public long getIntelligence() {
        return Intelligence;
    }*/

    @Override
    public String toString() {
        return String.format(
                "Character[id=%d, characterName='%s', strength='%d', dexterity='%d', constitution='%d', intelligence='%d']",
                id, characterName, Strength, Dexterity, Constitution, Intelligence);
    }

}