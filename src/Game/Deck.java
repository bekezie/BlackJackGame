package Game;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;
    private ArrayList<Card> discard = new ArrayList<>();
    public Deck()
    {

        // used to add face values into name array list
        int i = 2;

        // helper variable used to locate suit name when adding to deck arraylist
        int k = 0;

        deck = new ArrayList<>();
        ArrayList<String> suit = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();

        suit.add("Clubs");
        suit.add("Diamonds");
        suit.add("Hearts");
        suit.add("Spades");

        for(int j = 0; j < 9; j++)
        {
            String s = String.valueOf(i);
            name.add(s);
            i++;
        }
        name.add("King");
        name.add("Queen");
        name.add("Jack");
        name.add("Ace");

        i = 0;
        for(int j = 0; j < 52; j++)
        {

            if(i >= 13) {
                i = 0;
                k++;
            }
            deck.add(new Card(suit.get(k), name.get(i)));
            i++;
        }

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
            System.out.println("Reshuffling from discarded deck.");
            while (discard.size() > 0)
            {
                deck.add(discard.remove(0));
            }
            ShuffleDeck();
            aCard = new Card(deck.remove(0));
            return aCard;
        }

    }

    public void DisCard(Card aCard)
    {
        discard.add(aCard);
        //return discard;
    }

}
