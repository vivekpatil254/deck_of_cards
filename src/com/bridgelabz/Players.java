package com.bridgelabz;
import java.util.*;
import java.lang.*;

import java.util.Scanner;

public class Players {

    int numberOfPlayers;

   Players()
   {
        Scanner scanner=new Scanner(System.in);
       System.out.println("\n Enter the number of players in a game : ");
       numberOfPlayers=scanner.nextInt();
       if(numberOfPlayers<2&&numberOfPlayers>4) {
           System.out.println("Number of players should be between 2 to 4.");
           System.exit(0);
       }
   }
public void distribute()
{
    DeckOfCards cards=new DeckOfCards();
    cards.shuffle();
    cards.displayCards();
}


}