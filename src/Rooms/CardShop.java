package Rooms;

import Game.Runner;
import People.Person;

import java.util.Scanner;

public class CardShop extends Room {
    public CardShop(int x1, int y1) {
        super(x1,y1);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x, String input) {

        occupant = x;
        x.setxLoc(0);
        x.setyLoc(0);
        x.setxDeck(this.xDeck);
        x.getxGold(this.xGold);
        System.out.println("Grandpa: Welcome to the Card Shop! How can we assist you?");
            if(xDeck >=-1 & xDeck<=1) {
                System.out.println("Grandpa: Oh is this your first time playing CreatureBrawl? Well lets teach you how to play.");
                System.out.println("Grandpa: You need to collect five creatures to help you on your journey.");
                System.out.println("Grandpa: You collect them by befriending them.");
                System.out.println("Grandpa: Here I will give you your first Creature. Their name is Ray");
                xDeck=1;
                System.out.println("Congratulations you got Ray. Would you like to get some information on you creature? (Y/N)");
                if(input == "Y"){
                    System.out.println("Ray: Lvl:1/Summary: A young Manta Ray/Type: Thunder/Aqua/Happiness:5."); }
            }

    }

}
