package  application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class Battle {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

/*    public GameCharacter Begin(GameCharacter c1, GameCharacter c2) {

        int hp1 = c1.GetConstitution() * 10;
        int hp2 = c2.GetConstitution() * 10;
        int s1 = c1.GetStrength();
        int s2 = c2.GetStrength();
        int d1 = c1.GetDexterity();
        int d2 = c2.GetDexterity();
        int i1 = c1.GetIntelligence();
        int i2 = c2.GetIntelligence();

        while(hp1 > 0 || hp2>0) {
            Random r = new Random();
            int dice1 = r.nextInt(20);
            int dice2 = r.nextInt(20);
            if (d1 + dice1 > d2 + dice2) {
                hp2 -= s1 > i1 ? s1 : i1;
            } else if (d1 + dice1 < d2 + dice2) {
                hp1 -= s2 > i2 ? s2 : i2;
            } else {
                continue;
            }
        }

        if (hp1 > 0) {
            return c1;
        }
        else {
            return c2;
        }

    }*/

}
