package com.techelevator.nintendo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        VideoGameCharacter mario = new Mario();
        VideoGameCharacter luigi = new Luigi();

        List<VideoGameCharacter> characters = new ArrayList<>();
        characters.add(mario);
        characters.add(luigi);

        boolean pressRight = true;
        boolean pressA = true;


        if(pressRight && pressA) {
            for(VideoGameCharacter character : characters) {

                //we can only call methods that exist in the VideoGameCharacter class
                character.run();

                //Mario and Luigi only inherit Jump, they don't implement it themselves. But we can still use it.
                character.jump();

                //if we want to do something specific per child class
                //we can use instanceof and then cast to that class
                if(character instanceof Mario) {
                    Mario m = (Mario)character;
                    m.setFlower(true);
                }
            }
        }

    }
}
