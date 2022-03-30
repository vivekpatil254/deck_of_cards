package com.bridgelabz;

import java.util.*;
import java.lang.*;

import java.util.Scanner;

public class Players {

    public static int numberOfPlayers;

    Players() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter the number of players in a game : ");
        numberOfPlayers = scanner.nextInt();
        DeckOfCards cards = new DeckOfCards();
        cards.shuffle();
        cards.displayCards();
        cards.distribute();

    }
}