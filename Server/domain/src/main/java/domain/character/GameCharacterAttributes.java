package domain.character;

import javax.persistence.*;

@Entity
public class GameCharacterAttributes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Character character;
    private long hitPoint;
    private long speed;
    private long attackPower;
    private long armor;
    private long dodge;
    private long spellPower;
    private long spellResistance;

    public GameCharacterAttributes() {
    }

    public GameCharacterAttributes(Character character) {
        this.character = character;
    }

    //region Getter

    public Character getCharacter() {
        return character;
    }

    public long getHitPoint() {
        return hitPoint;
    }

    public long getSpeed() {
        return speed;
    }

    public long getAttackPower() {
        return attackPower;
    }

    public long getArmor() {
        return armor;
    }

    public long getDodge() {
        return dodge;
    }

    public long getSpellPower() {
        return spellPower;
    }

    public long getSpellResistance() {
        return spellResistance;
    }

    //endregion

    //region Setter

    public void setHitPoint(long hitPoint) {
        this.hitPoint = hitPoint;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public void setAttackPower(long attackPower) {
        this.attackPower = attackPower;
    }

    public void setArmor(long armor) {
        this.armor = armor;
    }

    public void setDodge(long dodge) {
        this.dodge = dodge;
    }

    public void setSpellPower(long spellPower) {
        this.spellPower = spellPower;
    }

    public void setSpellResistance(long spellResistance) {
        this.spellResistance = spellResistance;
    }

    //endregion

    @Override
    public String toString() {
        return String.format(
                "CharacterAttributes[id=%d, hp='%d', speed='%d', ap='%d', armor='%d', dodge='%d', sp='%d', sr='%d']",
                id, hitPoint, speed, attackPower, armor, dodge, spellPower, spellResistance);
    }

}
