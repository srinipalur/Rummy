import java.util.Random;

public class Rummy
{
    public static void main(String[] args)
    {
        //initialize array of cards
        //Shuffle array
        //Deal cards
        //Identify winning sets
        Card deck[]=new Card[52];
        int cardNum=0;
        for(int i=0;i<13;i++)
            for(int j=0;j<4;j++)
            {
                if(cardNum==52)
                    break;
                deck[cardNum] = new Card(i, j);
                cardNum++;
            }

        Card.Shuffle(deck);
        Card.printDeck(deck);
        Card x = Card.drawRandomCard(deck);
        x.printSingleCard();
    }
}