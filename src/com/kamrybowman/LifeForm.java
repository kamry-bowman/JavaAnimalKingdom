package com.kamrybowman;

public interface LifeForm {

    void eat(int quantity);

    int getHunger();

    int getYear();

    String move();
    String breathe();
    String reproduce();
}
