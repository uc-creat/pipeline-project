package org.prograd;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VillainTest {

    static Villain armedVillain;
    static Villain unarmedVillain;
    static int fullHealth = 100;
    static int gunOneDamage = 30;
    static int gunTwoDamage = 50;
    static int gunOneDamageWithArmour = 20;
    static int gunTwoDamageWithArmour = 40;

    @BeforeEach
    public void setup(){
        armedVillain = new Villain("Utkarsh", "sword", 100, true);
        unarmedVillain = new Villain("Utkarsh", "sword", 100, false);
    }

    @Test
    void toCheckTheHealthAfterGettingDamagedByGunOne(){

        int expectedHealth = (fullHealth - gunOneDamage);
        unarmedVillain.damageByGun1();
        int actualHealth = unarmedVillain.getHealth();

        assertEquals(expectedHealth,actualHealth);

    }

    @Test
    void toCheckTheHealthAfterGettingDamagedByGunTwo(){

        int expectedHealth = (fullHealth - gunTwoDamage);
        unarmedVillain.damageByGun2();
        int actualHealth = unarmedVillain.getHealth();

        assertEquals(expectedHealth,actualHealth);

    }

    @Test
    void toCheckTheHealthAfterGettingDamagedByAnyGunAndGettingHealed(){

        int expectedHealth = fullHealth;
        unarmedVillain.damageByGun1();
        unarmedVillain.heal();
        int actualHealth = unarmedVillain.getHealth();

        assertEquals(expectedHealth,actualHealth);

    }


    @Test
    void toCheckTheHealthAfterGettingDamagedByGunOneWithArmour(){

        int expectedHealth = (fullHealth - gunOneDamageWithArmour);
        armedVillain.damageByGun1();
        int actualHealth = armedVillain.getHealth();

        assertEquals(expectedHealth,actualHealth);

    }

    @Test
    void toCheckTheHealthAfterGettingDamagedByGunTwoWithArmour(){

        int expectedHealth = (fullHealth - gunTwoDamageWithArmour);
        armedVillain.damageByGun2();
        int actualHealth = armedVillain.getHealth();

        assertEquals(expectedHealth,actualHealth);

    }

    @Test
    void toCheckTheHealthAfterGettingDamagedByAnyGunAndGettingHealedWithArmour(){

        int expectedHealth = fullHealth;
        armedVillain.damageByGun1();
        armedVillain.heal();
        int actualHealth = armedVillain.getHealth();

        assertEquals(expectedHealth,actualHealth);

    }



}
