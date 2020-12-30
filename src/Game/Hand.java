package Game;

import java.util.ArrayList;
import java.util.Collections;

public class Hand extends Deck{
    private ArrayList<Card> hand = new ArrayList<>();

    public Hand()
    {
        Deck d = new Deck();
        AddCard(d.RemoveCard());
        AddCard(d.RemoveCard());
        AddCard(d.RemoveCard());
        AddCard(d.RemoveCard());
        AddCard(d.RemoveCard());
    }
    public Hand(Card aCard)
    {
        AddCard(aCard);
    }

    @Override
    public void AddCard(Card aCard)
    {
        if(aCard == null)
        {
            System.out.println("Card cannot be null.");
            System.exit(0);
        }
        hand.add(aCard);


    }

    @Override
    public Card RemoveCard()
    {
        if(hand == null)
        {
            System.out.println("Hand cannot be null.");
            System.exit(0);
        }
        return hand.remove(0);
    }

    @Override
    public void ShuffleDeck()
    {
        Collections.shuffle(hand);

    }

    public void Fold(Deck d)
    {
        while (hand.size() > 0)
        {
            d.DisCard(hand.remove(0));
        }
    }

    public int getHandSize()
    {
        return hand.size();
    }

    public Card getCard(int intex)
    {
        return hand.get(intex);
    }

    @Override
    public void SortDeck()
    {
        Collections.sort(hand);
    }


    public void PrintDeck()
    {
        for (int i = 0; i < hand.size(); i++)
        {
            System.out.println(hand.get(i));
        }
    }

    public String toString()
    {
        String s = "";
        for(int i = 0; i < hand.size(); i++)
        {
            s+= hand.get(i).toString() + "\n";
        }
        return s;
    }

}
