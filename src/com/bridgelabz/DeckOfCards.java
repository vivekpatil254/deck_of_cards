package com.bridgelabz;
public class DeckOfCards {

    String[] suits = {"clubs", "diamonds", "hearts", "spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    int deck[] = new int[52];
   int player1SuitCount[]={0,0,0,0};//new int[4];
    int player2SuitCount[]={0,0,0,0};//new int[4];
    int player3SuitCount[]={0,0,0,0};//new int[4];
    int player4SuitCount[]={0,0,0,0};//new int[4];
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
            for(i=0,j=0;i<9;i++,j++)
            {
                suit1[i]=suit[j];
                rank1[i]=rank[j];
                j++;
                suit2[i]=suit[j];
                rank2[i]=rank[j];
                System.out.println("\t"+rank1[i]+"  "+suit1[i]+"\t\t\t"+rank2[i]+"  "+suit2[i]);
                if(suit1[i]=="clubs")
                    player1SuitCount[0]++;
                if(suit1[i]=="diamonds")
                    player1SuitCount[1]++;
                if(suit1[i]=="hearts")
                    player1SuitCount[2]++;
                if(suit1[i]=="spades")
                    player1SuitCount[3]++;

                if(suit2[i]=="clubs")
                    player2SuitCount[0]++;
                if(suit2[i]=="diamonds")
                    player2SuitCount[1]++;
                if(suit2[i]=="hearts")
                    player2SuitCount[2]++;
                if(suit2[i]=="spades")
                    player2SuitCount[3]++;
                }
            System.out.println("\t clubs  "+player1SuitCount[0]+"\t\t\t"+" clubs  "+player2SuitCount[0]);
            System.out.println("\t diamonds "+player1SuitCount[1]+"\t\t\t"+" diamomds "+player2SuitCount[1]);
            System.out.println("\t hearts "+player1SuitCount[2]+"\t\t\t"+" hearts "+player2SuitCount[2]);
            System.out.println("\t spades "+player1SuitCount[3]+"\t\t\t"+" spades "+player2SuitCount[3]);
        }

        if (Players.numberOfPlayers == 3) {
            System.out.println("\n\tPlayer1 \t\t\t\t Player 2 \t\t\t\t Player 3");
            for(i=0,j=0;i<9;i++,j++)
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

                if(suit1[i]=="clubs")
                    player1SuitCount[0]++;
                if(suit1[i]=="diamonds")
                    player1SuitCount[1]++;
                if(suit1[i]=="hearts")
                    player1SuitCount[2]++;
                if(suit1[i]=="spades")
                    player1SuitCount[3]++;

                if(suit2[i]=="clubs")
                    player2SuitCount[0]++;
                if(suit2[i]=="diamonds")
                    player2SuitCount[1]++;
                if(suit2[i]=="hearts")
                    player2SuitCount[2]++;
                if(suit2[i]=="spades")
                    player2SuitCount[3]++;

                if(suit3[i]=="clubs")
                    player3SuitCount[0]++;
                if(suit3[i]=="diamonds")
                    player3SuitCount[1]++;
                if(suit3[i]=="hearts")
                    player3SuitCount[2]++;
                if(suit3[i]=="spades")
                    player3SuitCount[3]++;
            }
           System.out.println("\t Clubs  "+player1SuitCount[0]+"\t\t\t"+" Clubs  "+player2SuitCount[0]+"\t\t\t\t"+" Clubs  "+player3SuitCount[0]);
            System.out.println("\t Diamonds "+player1SuitCount[1]+"\t\t\t"+" Diamomds "+player2SuitCount[1]+"\t\t\t"+" Diamomds "+player3SuitCount[1]);
            System.out.println("\t Hearts "+player1SuitCount[2]+"\t\t\t"+" Hearts "+player2SuitCount[2]+"\t\t\t"+" Hearts "+player3SuitCount[2]);
            System.out.println("\t Spades "+player1SuitCount[3]+"\t\t\t"+" Spades "+player2SuitCount[3]+"\t\t\t"+" Spades "+player3SuitCount[3]);

        }

        if (Players.numberOfPlayers == 4) {
            System.out.println("\n\tPlayer1 \t\t\t\t Player 2 \t\t\t\t Player 3\t\t\t\t Player 4");
            for(i=0,j=0;i<9;i++,j++)
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


                if(suit1[i]=="clubs")
                    player1SuitCount[0]++;
                if(suit1[i]=="diamonds")
                    player1SuitCount[1]++;
                if(suit1[i]=="hearts")
                    player1SuitCount[2]++;
                if(suit1[i]=="spades")
                    player1SuitCount[3]++;

                if(suit2[i]=="clubs")
                    player2SuitCount[0]++;
                if(suit2[i]=="diamonds")
                    player2SuitCount[1]++;
                if(suit2[i]=="hearts")
                    player2SuitCount[2]++;
                if(suit2[i]=="spades")
                    player2SuitCount[3]++;

                if(suit3[i]=="clubs")
                    player3SuitCount[0]++;
                if(suit3[i]=="diamonds")
                    player3SuitCount[1]++;
                if(suit3[i]=="hearts")
                    player3SuitCount[2]++;
                if(suit3[i]=="spades")
                    player3SuitCount[3]++;

                if(suit4[i]=="clubs")
                    player4SuitCount[0]++;
                if(suit4[i]=="diamonds")
                    player4SuitCount[1]++;
                if(suit4[i]=="hearts")
                    player4SuitCount[2]++;
                if(suit4[i]=="spades")
                    player4SuitCount[3]++;
            }

            System.out.println("\t Clubs  "+player1SuitCount[0]+"\t\t\t"+" Clubs  "+player2SuitCount[0]+"\t\t\t"+" Clubs  "+player3SuitCount[0]+"\t\t\t"+" Clubs  "+player4SuitCount[0]);
            System.out.println("\t Diamonds "+player1SuitCount[1]+"\t\t\t"+" Diamomds "+player2SuitCount[1]+"\t\t\t"+" Diamomds "+player3SuitCount[1]+"\t\t\t"+" Diamomds "+player4SuitCount[1]);
            System.out.println("\t Hearts "+player1SuitCount[2]+"\t\t\t"+" Hearts "+player2SuitCount[2]+"\t\t\t"+" Hearts "+player3SuitCount[2]+"\t\t\t"+" Hearts "+player4SuitCount[2]);
            System.out.println("\t Spades "+player1SuitCount[3]+"\t\t\t"+" Spades "+player2SuitCount[3]+"\t\t\t"+" Spades "+player3SuitCount[3]+"\t\t\t"+" Spades "+player4SuitCount[3]);

        }

    }
}