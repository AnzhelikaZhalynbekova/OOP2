public class Card
{
    // These constants represent the possible suits and
    // can be used to index into the suits array to get
    // their string representation.
    private static final int HEARTS = 0;
    private static final int DIAMONDS = 1;
    private static final int SPADES = 2;
    private static final int CLUBS = 3;

    // These constants represent the ranks of the non-number
    // cards, or cards above 10. To maintain the ordering after
    // 2-10, the integer values are 11, 12, 13, and 14 and
    // also allow us to index into the ranks array to get their
    // String representation.
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;
    private static final int ACE = 14;

    // Instance variables

    // This represents the rank of the card, the value from 2 to Ace.
    private int rank;

    // This represents the suit of the card, one of hearts, diamonds, spades or clubs.
    private int suit;

    // This represents the value of the card, which is 10 for face cards or 11 for an ace.
    private int value;

    // This String array allows us to easily get the String value of a Card from its rank.
    // There are two Xs in the front to provide padding so numbers have their String representation
    // at the corresponding index. For example, the String for 2 is at index 2.
    private String[] ranks = {"X", "X", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    // The  index into this array.
    private String[] suits = {"H", "D", "S", "C"};

    public Card(int r, int s)
    {
        rank = r;
        suit = s;
    }

    public int getRank()
    {
        return rank;
    }

    public int getSuit()
    {
        return suit;
    }

    public int getValue()
    {
        int value = rank;
        if(rank > 10)
        {
            value = 10;
        }

        if(rank == ACE)
        {
            value = 11;
        }

        return value;
    }

    public String rankToString(int r)
    {
        return ranks[r];
    }

    public String suitToString(int s)
    {
        return suits[s];
    }

    public String getSuitAsString()
    {
        return suitToString(suit);
    }

    /**
     * Return the String version of the rank.
     *
     * @return String version of the rank.
     */
    public String getRankAsString()
    {
        return rankToString(rank);
    }


    public String toString()
    {
        // Get a string for rank
        String rankString = ranks[rank];

        // Get a string for the suit
        String suitString = suits[suit];

        // combine those
        return rankString + suitString;
    }
}