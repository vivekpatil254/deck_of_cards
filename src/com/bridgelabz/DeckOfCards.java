package com.bridgelabz;
public class DeckOfCards {

    String[] suits = {"clubs", "diamond", "hearts", "spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    int deck[] = new int[52];
    String[] suit=new String[52];
    String[] rank=new String[52];
    String[] suit1=new String[9];
    String[] suit2=new String[9];
    String[] suit3=new String[9];
    String[] suit4=new String[9];
    String[] rank1=new String[9];
    String[] rank2=new String[9];
    String[] rank3=new String[9];
    String[] rank4=new String[9];

        public void shuffle()
         {   int i;
        for(i=0;i<52;i++)
            deck[i]=i;
        for (i = 0; i < 52; i++) {
           int randomIndex = (int) (Math.random() * 52);
            int temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
            }
          }
        public void displayCards()
        {

            for (int i = 0; i < 52; i++) {
                suit[i] = suits[deck[i] /13];
                rank[i] = ranks[deck[i] % 13];
                System.out.println(rank[i] + " of " + suit[i]);
                }
        }
        public void distribute()
        {
            int i,j;
            for()



        }

}
