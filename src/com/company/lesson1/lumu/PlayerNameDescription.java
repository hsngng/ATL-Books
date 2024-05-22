package com.company.lesson1.lumu;

import java.util.Comparator;

public class PlayerNameDescription implements Comparator<Player> {

    @Override
    public int compare(Player s1, Player s2) {
        return s2.getName().compareTo(s1.getName());
    }
}
