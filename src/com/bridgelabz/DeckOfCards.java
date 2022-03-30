package com.bridgelabz;
public class DeckOfCards {

    String[] suits = {"clubs", "diamond", "hearts", "spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    int deck[] = new int[52];
    String[] suit = new String[52];
    String[] rank = new String[52];
    String[] suit1 = new String[9];
    String[] suit2 = new String[9];
    String[] suit3 = new String[9];
    String[] suit4 = new String[9];
    String[] rank1 = new String[9];
    String[] rank2 = new String[9];
    String[] rank3 = new String[9];
    String[] rank4 = new String[9];

    public void shuffle() {
        int i;
        for (i = 0; i < 52; i++)
            deck[i] = i;
        for (i = 0; i < 52; i++) {
            int randomIndex = (int) (Math.random() * 52);
            int temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public void displayCards() {

        for (int i = 0; i < 52; i++) {
            suit[i] = suits[deck[i] / 13];
            rank[i] = ranks[deck[i] % 13];
            System.out.println(rank[i] + " of " + suit[i]);
        }
    }

    public void distribute() {
        int i,j;
        if (Players.numberOfPlayers == 2) {
            System.out.println("\n\tPlayer1 \t\t\t\t Player 2");
            for(i=0,j=0;i<18;i++,j++)
            {
                suit1[i]=suit[j];
                rank1[i]=rank[j];
                j++;
                suit2[i]=suit[j];
                rank2[i]=rank[j];
                System.out.println("\t"+rank1[i]+"  "+suit1[i]+"\t\t\t"+rank2[i]+"  "+suit2[i]);
            }


        }

        if (Players.numberOfPlayers == 3) {
            System.out.println("\n\tPlayer1 \t\t\t\t Player 2 \t\t\t\t Player 3");
            for(i=0,j=0;i<27;i++,j++)
            {
                suit1[i]=suit[j];
                rank1[i]=rank[j];
                j++;
                suit2[i]=suit[j];
                rank2[i]=rank[j];
                j++;
                suit3[i]=suit[j];
                rank3[i]=rank[j];
                System.out.println("\t"+rank1[i]+"  "+suit1[i]+"\t\t\t\t"+rank2[i]+"  "+suit2[i]+"\t\t\t\t"+rank3[i]+"  "+suit3[i]);
            }


        }

        if (Players.numberOfPlayers == 4) {
            System.out.println("\n\tPlayer1 \t\t\t\t Player 2 \t\t\t\t Player 3\t\t\t\t Player 4");
            for(i=0,j=0;i<36;i++,j++)
            {
                suit1[i]=suit[j];
                rank1[i]=rank[j];
                j++;
                suit2[i]=suit[j];
                rank2[i]=rank[j];
                j++;
                suit3[i]=suit[j];
                rank3[i]=rank[j];
                j++;
                suit4[i]=suit[j];
                rank4[i]=rank[j];
                System.out.println("\t"+rank1[i]+"  "+suit1[i]+"\t\t\t"+rank2[i]+"  "+suit2[i]+"\t\t\t"+rank3[i]+"  "+suit3[i]+"\t\t\t"+rank4[i]+"  "+suit4[i]);
            }


        }

    }
}