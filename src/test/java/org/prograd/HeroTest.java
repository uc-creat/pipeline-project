
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.prograd.Hero;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeroTest {

    static Hero hero;
    static int fullHealth = 100;
    static int gunOneDamage = 30;
    static int gunTwoDamage = 50;

    @BeforeEach
    public void setup(){
        hero = new Hero("Sethu", "sword", 100);
    }

    @Test
    void toCheckTheHealthAfterGettingDamagedByGunOne(){

        int expectedHealth = (fullHealth - gunOneDamage);
        hero.damageByGun1();
        int actualHealth = hero.getHealth();

        assertEquals(expectedHealth,actualHealth);

    }

    @Test
    void toCheckTheHealthAfterGettingDamagedByGunTwo(){

        int expectedHealth = (fullHealth - gunTwoDamage);
        hero.damageByGun2();
        int actualHealth = hero.getHealth();

        assertEquals(expectedHealth,actualHealth);

    }

    @Test
    void toCheckTheHealthAfterGettingDamagedByAnyGunAndGettingHealed(){

        int expectedHealth = fullHealth;
        hero.damageByGun1();
        hero.heal();
        int actualHealth = hero.getHealth();

        assertEquals(expectedHealth,actualHealth);

    }



}
