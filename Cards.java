
import java.util.ArrayList;
import java.util.*;


public class Cards {

    int counter = 1;
    public void CreateCards(ArrayList<String> hand) {
        for (int i = 0; i <= 48; i += 4) {
            hand.add(i, counter + " Hearts");
            hand.add(i+1, counter + " Diamonds");
            hand.add(i+2, counter + " Clubs");
            hand.add(i+3, counter + " Spades");
            counter++;
        }
    }

    /**
     * @param player1Card -> full string that holds card value and suit
     * @return card value only after parsing substring index(0, value) as an int
     */
    public int getplayer1CardValue(String player1Card) {

        Scanner scan = new Scanner(player1Card);
        String rank = null;
        if (scan.hasNextInt()) {
            rank = scan.next();
        }

        if(rank != null)
            return Integer.parseInt(rank);
        else
            return 0;
    }

    /**
     * @param player2Card -> full string that holds card value and suit
     * @return card value only after parsing substring index(0, 1) as an int
     */
    public int getplayer2CardValue(String player2Card) {

        Scanner scan = new Scanner(player2Card);
        String rank = null;
        if (scan.hasNextInt()) {
            rank = scan.next();
        }

        if(rank != null)
            return Integer.parseInt(rank);
        else
            return 0;
    }



}