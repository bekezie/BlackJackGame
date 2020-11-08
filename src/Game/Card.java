package Game;

public class Card implements Comparable{
    private String suit;
    private String name;

    public Card(String aSuit, String aName)
    {
        if(aSuit == null)
        {
            System.out.println("Suit can not be null");
            System.exit(0);
        }

        if(aName == null)
        {
            System.out.println("Name can not be null");
            System.exit(0);
        }

        setSuit(aSuit);
        setName(aName);
    }
    public Card(Card otherObject)
    {
        if(otherObject == null)
        {
            System.out.println("Card cannot be null.");
            System.exit(0);
        }
        suit = otherObject.suit;
        name = otherObject.name;

    }

    public void setSuit(String aSuit)
    {


        if(!((aSuit.equalsIgnoreCase("Clubs") || aSuit.equalsIgnoreCase("Diamonds")
                || aSuit.equalsIgnoreCase("Hearts") || aSuit.equalsIgnoreCase("Spades"))))
        {
            System.out.println("Invalid suit!");
            System.out.println("Must be Clubs, Diamonds, Hearts or Spades.");
            System.exit(0);
        }
        suit = aSuit;


    }
    public void setName(String aName)
    {


        if(!(aName.equalsIgnoreCase("2") || aName.equalsIgnoreCase("3")
                || aName.equalsIgnoreCase("4") || aName.equalsIgnoreCase("5")
                || aName.equalsIgnoreCase("6") || aName.equalsIgnoreCase("7")
                || aName.equalsIgnoreCase("8") || aName.equalsIgnoreCase("9")
                || aName.equalsIgnoreCase("10") || aName.equalsIgnoreCase("Ace")
                || aName.equalsIgnoreCase("Jack") || aName.equalsIgnoreCase("King")
                || aName.equalsIgnoreCase("Queen")))
        {
            System.out.println("Invalid Name!");
            System.out.println("Must be 2-10, King, Queen, Jack or Ace.");
            System.exit(0);
        }
        name = aName;

    }

    public String getSuit() {
        return suit;
    }

    public String getName() {
        return name;
    }

    private int IntCheck(String value) {
        if (value.equalsIgnoreCase("2")) {
            return 2;
        } else if (value.equalsIgnoreCase("3")) {

            return 3;
        } else if (value.equalsIgnoreCase("4")) {

            return 4;
        } else if (value.equalsIgnoreCase("5")) {

            return 5;
        } else if (value.equalsIgnoreCase("6")) {

            return 6;
        } else if (value.equalsIgnoreCase("7")) {

            return 7;
        } else if (value.equalsIgnoreCase("8")) {

            return 8;
        } else if (value.equalsIgnoreCase("9")) {

            return 9;
        } else if (value.equalsIgnoreCase("10")) {

            return 10;
        } else if (value.equalsIgnoreCase("King")) {

            return 13;

        } else if (value.equalsIgnoreCase("Jack")) {

            return 11;
        } else if (value.equalsIgnoreCase("Queen")) {

            return 12;
        } else if (value.equalsIgnoreCase("Ace")) {

            return 1;
        } else
            System.out.println("Invalid input");
        return -1;
    }

    public static int getValue(String value) {
        if (value.equalsIgnoreCase("2")) {
            return 2;
        } else if (value.equalsIgnoreCase("3")) {

            return 3;
        } else if (value.equalsIgnoreCase("4")) {

            return 4;
        } else if (value.equalsIgnoreCase("5")) {

            return 5;
        } else if (value.equalsIgnoreCase("6")) {

            return 6;
        } else if (value.equalsIgnoreCase("7")) {

            return 7;
        } else if (value.equalsIgnoreCase("8")) {

            return 8;
        } else if (value.equalsIgnoreCase("9")) {

            return 9;
        } else if (value.equalsIgnoreCase("10")) {

            return 10;
        } else if (value.equalsIgnoreCase("King")) {

            return 10;

        } else if (value.equalsIgnoreCase("Jack")) {

            return 10;
        } else if (value.equalsIgnoreCase("Queen")) {

            return 10;
        } else if (value.equalsIgnoreCase("Ace")) {

            return 0;
        } else
            System.out.println("Invalid input");
        return -1;
    }
    @Override
    public int compareTo(Object otherObject){

        Card otherCard = (Card) otherObject;
        int card1 = IntCheck(getName());
        int card2 = IntCheck(otherCard.name);

        if(card1 < card2)
        {
            return -1;
        }
        else if(card1  > card2)
        {
            return 1;
        }
        else
            return 0;
    }

    @Override
    public String toString()
    {
        return "Suit: " + suit + ", Name: " + name;
    }

    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;

        else if (getClass() != otherObject.getClass())
            return false;

        Card otherCard = (Card) otherObject;
        return (suit.equals(otherCard.suit) && name.equals(otherCard.name));
    }
}

