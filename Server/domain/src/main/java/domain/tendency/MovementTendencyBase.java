package domain.tendency;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovementTendencyBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean isPreferMelee;
    private boolean isPreferStand;

    public MovementTendencyBase() {
    }

    public MovementTendencyBase(String name, boolean isPreferMelee, boolean isPreferStand) {
        this.name = name;
        this.isPreferMelee = isPreferMelee;
        this.isPreferStand = isPreferStand;
    }

    public boolean isPreferMelee() {
        return isPreferMelee;
    }

    public boolean isPreferStand() {
        return isPreferStand;
    }

}
