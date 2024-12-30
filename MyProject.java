import java.util.ArrayList;
import java.util.*;

public class MyProject {

    public static void main(String[] args) {

        deck deck = new deck();
        ArrayList<String> cardsList = new ArrayList<>(); //initialize an ArrayList to hold all cards
        ArrayList<String> player1 = new ArrayList<>(); // create Player1 hand (ArrayList)
        ArrayList<String> player2 = new ArrayList<>(); // create Player2 hand (ArrayList)

        ArrayList<String> cardPile = new ArrayList<>();

        deck.CreateCards(cardsList); //putting cards in the deck
        deck.shuffleDeck(cardsList); // shuffle deck before dealing cards to each of the 2 players
        deck.dealDeck(cardsList, player1, player2); // deal deck to each player, dealing every other


        System.out.println("Ready to Play!");
        boolean playGame = true;
        while (playGame && !player1.isEmpty() && !player2.isEmpty()) {

            Scanner enter = new Scanner(System.in);
            System.out.println("Press 1 to continue or press any number or letter to end game");
            if (!enter.next().equalsIgnoreCase("1")) {
                System.out.println("Thank you for playing!");
                playGame = false;
            } else{
                deck.playRound(player1, player2, cardPile);
            }

            if(player1.isEmpty()){
                System.out.println("Player 1 has no cards, Player 2 WINS!!!");
                break;
            } else if(player2.isEmpty()){
                System.out.println("Player 2 has no cards, Player 1 WINS!!!");
                break;
            }

        } // ---- END OF WHILE LOOP ----


    }

}
