package gameEntities.Behaviours;

import javax.persistence.Entity;

@Entity
public class MeleeMovementBehaviour extends MovementBehaviourBase {

    public MeleeMovementBehaviour() {
        super();
    }

    public MeleeMovementBehaviour(String name, boolean isPreferMelee, boolean isPreferStand) {
        super(name, isPreferMelee, isPreferStand);
    }

}
