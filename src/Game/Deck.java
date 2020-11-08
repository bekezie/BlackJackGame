package Game;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;
    private ArrayList<Card> discard;
    public Deck()
    {

        deck = new ArrayList<>();
        deck.add(new Card("Clubs", "2"));
        deck.add(new Card("Clubs", "3"));
        deck.add(new Card("Clubs", "4"));
        deck.add(new Card("Clubs", "5"));
        deck.add(new Card("Clubs", "6"));
        deck.add(new Card("Clubs", "7"));
        deck.add(new Card("Clubs", "8"));
        deck.add(new Card("Clubs", "9"));
        deck.add(new Card("Clubs", "10"));
        deck.add(new Card("Diamonds", "2"));
        deck.add(new Card("Diamonds", "3"));
        deck.add(new Card("Diamonds", "4"));
        deck.add(new Card("Diamonds", "5"));
        deck.add(new Card("Diamonds", "6"));
        deck.add(new Card("Diamonds", "7"));
        deck.add(new Card("Diamonds", "8"));
        deck.add(new Card("Diamonds", "9"));
        deck.add(new Card("Diamonds", "10"));
        deck.add(new Card("Hearts", "2"));
        deck.add(new Card("Hearts", "3"));
        deck.add(new Card("Hearts", "4"));
        deck.add(new Card("Hearts", "5"));
        deck.add(new Card("Hearts", "6"));
        deck.add(new Card("Hearts", "7"));
        deck.add(new Card("Hearts", "8"));
        deck.add(new Card("Hearts", "9"));
        deck.add(new Card("Hearts", "10"));
        deck.add(new Card("Spades", "2"));
        deck.add(new Card("Spades", "3"));
        deck.add(new Card("Spades", "4"));
        deck.add(new Card("Spades", "5"));
        deck.add(new Card("Spades", "6"));
        deck.add(new Card("Spades", "7"));
        deck.add(new Card("Spades", "8"));
        deck.add(new Card("Spades", "9"));
        deck.add(new Card("Spades", "10"));
        deck.add(new Card("Clubs", "King"));
        deck.add(new Card("Clubs", "Queen"));
        deck.add(new Card("Clubs", "Jack"));
        deck.add( new Card("Clubs", "Ace"));
        deck.add(new Card("Diamonds", "King"));
        deck.add(new Card("Diamonds", "Queen"));
        deck.add(new Card("Diamonds", "Jack"));
        deck.add( new Card("Diamonds", "Ace"));
        deck.add(new Card("Hearts", "King"));
        deck.add(new Card("Hearts", "Queen"));
        deck.add(new Card("Hearts", "Jack"));
        deck.add( new Card("Hearts", "Ace"));
        deck.add(new Card("Spades", "King"));
        deck.add(new Card("Spades", "Queen"));
        deck.add(new Card("Spades", "Jack"));
        deck.add( new Card("Spades", "Ace"));

    }
    public void PrintDeck()
    {
        for (int i = 0; i < deck.size(); i++)
        {
            System.out.println(deck.get(i));

        }
    }
    public void ShuffleDeck()
    {
        Collections.shuffle(deck);

    }
    public void SortDeck()
    {
        Collections.sort(deck);
    }


    public void AddCard(Card aCard)
    {
        if(aCard == null)
        {
            System.out.println("Card cannot be null.");
            System.exit(0);
        }
        deck.add(aCard);
    }

    public Card RemoveCard()
    {
        Card aCard;
        try {
            aCard = new Card(deck.remove(0));
            return aCard;
        }
        catch (Exception e)
        {
            System.out.println("The deck is empty!");
            System.out.println("Reshuffling from discard.");
            while (discard.size() >= 1)
            {
                deck.add(discard.remove(0));
            }
            ShuffleDeck();
            return RemoveCard();
        }
    }

    public ArrayList DisCard(Card aCard)
    {
        discard = new ArrayList<>();
        discard.add(aCard);
        return discard;
    }

}
