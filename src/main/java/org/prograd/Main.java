package org.prograd;

public class Main {

    public static void main(String[] args) {
        Hero player = new Hero("Sethu","sword",100);
        player.damageByGun1();
        System.out.println(player.getName());
        System.out.println(player.getHealth());
        System.out.println(player.getWeapon());


    }

}