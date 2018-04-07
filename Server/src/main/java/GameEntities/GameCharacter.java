package GameEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GameCharacter {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String characterName;
    private int Strength;
    private int Dexterity;
    private int Constitution;
    private int Intelligence;

    protected GameCharacter() {}

    public GameCharacter(String characterName, int strength, int dexterity, int constitution, int intelligence) {
        this.characterName = characterName;
        this.Strength = strength;
        this.Dexterity = dexterity;
        this.Constitution = constitution;
        this.Intelligence = intelligence;
    }

    @Override
    public String toString() {
        return String.format(
                "Character[id=%d, characterName='%s', strength='%d', dexterity='%d', constitution='%d', intelligence='%d']",
                id, characterName, Strength, Dexterity, Constitution, Intelligence);
    }

}