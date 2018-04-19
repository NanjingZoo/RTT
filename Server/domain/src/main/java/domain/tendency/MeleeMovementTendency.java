package domain.tendency;

import javax.persistence.Entity;

@Entity
public class MeleeMovementTendency extends MovementTendencyBase {

    public MeleeMovementTendency() {
        super();
    }

    public MeleeMovementTendency(String name, boolean isPreferMelee, boolean isPreferStand) {
        super(name, isPreferMelee, isPreferStand);
    }

}
