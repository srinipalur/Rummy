import java.math.*;
import java.util.Random;

public class Card
{
    String suit,num;
    String suits[]={"Spades","Hearts","Clubs","Diamonds"};
    String numbers[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    Card(int n,int s)
    {
        suit=suits[s];
        num=numbers[n];
    }

    //Method to swap cards
    static void swapCard(Card card1, Card card2)
    {
        String tempSuit, tempNum;
        tempSuit=card1.suit;
        tempNum=card1.num;
        card1.suit=card2.suit;
        card1.num=card2.num;
        card2.suit=tempSuit;
        card2.num=tempNum;
    }

    static void printDeck(Card[] deck)
    {
        for(int i=0;i<52;i++)
            System.out.println("Card is :"+deck[i].num+" of "+deck[i].suit);
    }
    static Card[] Shuffle(Card[] deck)
    {
        Random r = new Random();
        int temp=0;

        for(int i=deck.length-1;i>0;i--)
        {
            if(i==1)
                break;
            swapCard(deck[r.nextInt(i-1)],deck[i]);
        }
        return deck;
    }

    void printSingleCard()
    {
        System.out.println(num+" of "+suit);
    }

    static Card drawRandomCard(Card[] deck)
    {
        Random r = new Random();
        int randNum = r.nextInt(52);
        return deck[randNum];
    }
}