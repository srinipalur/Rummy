import java.util.Random;

public class Rummy
{
    public static void main(String[] args)
    {
        //initialize array of cards
        //Shuffle array
        //Deal cards
        //Identify winning sets
        Card deck[]=Card.initializeDeck();
        Card.Shuffle(deck);
        Card.printDeck(deck);
        Card x = Card.drawRandomCard(deck);
        x.printSingleCard();

        Card hand[]=new Card[7];

        for(int i=0;i<hand.length;i++)
        {
            hand[i]=Card.deck[i];
            Card.deck[i]=null;
        }
        System.out.println("Now printing the hand");
        Card.printDeck(hand);
    }
}