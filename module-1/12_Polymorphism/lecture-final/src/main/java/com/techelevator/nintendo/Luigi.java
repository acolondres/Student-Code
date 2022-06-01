package com.techelevator.nintendo;

public class Luigi extends VideoGameCharacter{

    public Luigi() {
        super("Luigi");
    }

    @Override
    public void run() {
        System.out.println("It's a me a Luigi and I'm a running!");
    }
}
