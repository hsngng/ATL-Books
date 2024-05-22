package com.company.lesson1.lumu;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerApp {
    public static void main(String[] args) {
        Player[] players = {new Player("Smith",20),
        new Player("Jones",15),
        new Player("Jones", 20)};

        System.out.println(Arrays.toString(players));
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));

        System.out.println("-------");
        Arrays.sort(players, new PlayerScoreComparator());
        System.out.println(Arrays.toString(players));

        System.out.println("-------");
        Arrays.sort(players, new PlayerNameDescription());
        System.out.println(Arrays.toString(players));

        System.out.println("--------");
        Arrays.sort(players, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(Arrays.toString(players));
        Player player = new Player("", 66);
    }
}

