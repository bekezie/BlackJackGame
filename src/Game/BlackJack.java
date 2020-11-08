package Game;

import java.util.*;

public class BlackJack {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input;
        Deck d = new Deck();



        while (true)
        {
            d.ShuffleDeck();
            Hand dealer = new Hand(d.RemoveCard());
            Hand player = new Hand(d.RemoveCard());
            dealer.AddCard(d.RemoveCard());
            player.AddCard(d.RemoveCard());

            while (true) {
                System.out.println(player + "Hand value: " + getHandValue(player));
                System.out.println("Hit or Stay?");
                input = keyboard.nextLine();
                if (input.equalsIgnoreCase("hit"))
                {
                    player.AddCard(d.RemoveCard());
                    if (getHandValue(player) > 21) {
                        System.out.println("bust");
                        System.out.println("You lost");
                        break;
                    }
                    continue;
                }

                else if(getHandValue(player) >= getHandValue(dealer))
                {
                    System.out.println("You won!");
                    break;
                }
                else
                {
                    System.out.println("You lost!");
                    break;
                }


            }
            System.out.println(" Dealer : \n" + dealer + "Hand value: " + getHandValue(dealer));
            System.out.println(" Player : \n" + player  + "Hand value: " + getHandValue(player));

            //Used so that if deck is empty you can add the discarded.
            //cards back into the deck and reshuffle th deck again.
            dealer.Fold(d);
            player.Fold(d);


            System.out.println("Do you want to play again?");
            input = keyboard.nextLine();
            if(input.equalsIgnoreCase("No"))
            {
                System.out.println("Good game.");
                System.exit(0);
            }

        }
    }

    public static int getHandValue(Hand p)
    {
        int i = 0;
        int value = 0;
        int total = 0;
        int aceCounter = 0;
        while (p.getHandSize() > i)
        {
            Card aCard = new Card(p.getCard(i));
            value = Card.getValue(aCard.getName());
            if(value > 9)
            {
                total += 10;
            }
            else if(value == 0)
            {
                aceCounter++;
            }
            else
            {
                total += value;
            }
            i++;
        }
        if(total + 10 + aceCounter > 21 && aceCounter > 0)
            total += aceCounter;

        else if(aceCounter > 0)
            total += 10 + aceCounter;

        return total;


    }
}
