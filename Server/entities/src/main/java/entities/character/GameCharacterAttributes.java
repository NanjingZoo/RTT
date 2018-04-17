package entities.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GameCharacterAttributes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected long characterId;
    protected long hitPoint;
    protected long speed;
    protected long attackPower;
    protected long armor;
    protected long dodge;
    protected long spellPower;
    protected long spellResistance;

    public GameCharacterAttributes() {
    }

    public GameCharacterAttributes(long characterId, long hitPoint, long speed, long attackPower, long armor, long dodge, long spellPower, long spellResistance) {
        this.hitPoint = hitPoint;
        this.characterId = characterId;
        this.speed = speed;
        this.attackPower = attackPower;
        this.armor = armor;
        this.dodge = dodge;
        this.spellPower = spellPower;
        this.spellResistance = spellResistance;
    }

    public long getId() {
        return id;
    }

    public long getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(long hitPoint)
    {
        this.hitPoint = hitPoint;
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

    public void getSpellPower(long spellPower) {
        this.spellPower = spellPower;
    }

    public void getSpellResistance(long spellResistance) {
        this.spellResistance = spellResistance;
    }

}
