import java.util.ArrayList;
import java.util.*;

public class deck extends Cards{

    public void shuffleDeck(ArrayList<String> deck){
        Collections.shuffle(deck);
    }

    public void dealDeck(ArrayList<String> deck, ArrayList<String> player1, ArrayList<String> player2){
        for(int i = 0; i < deck.size(); i++){
            if(i % 2 ==0){
                player2.add(deck.get(i));
            }
            else{
                player1.add(deck.get(i));
            }
        }
    }

    public void playRound(ArrayList<String> player1, ArrayList<String> player2, ArrayList<String> pile){

        if(!player1.isEmpty() && !player2.isEmpty()) {
            String player1Card = player1.removeFirst(); // holds value of card "laid down"
            String player2Card = player2.removeFirst(); // holds value of card "laid down"

            int player1Rank = getplayer1CardValue(player1Card);
            int player2Rank = getplayer2CardValue(player2Card);

            System.out.println("Player 1: " + player1Card + "\nPlayer 2: " + player2Card);

            pile.add(player1Card);
            pile.add(player2Card);

            if (player1Rank > player2Rank) {  //PLAYER 1 WINS
                System.out.println("Player 1 wins round!");
                player1.addLast(player1Card);
                player1.addLast(player2Card);
                shuffleDeck(player1);
            } else if (player1Rank < player2Rank) { //PLAYER2 WINS
                System.out.println("Player 2 wins round!");
                player2.addLast(player2Card);
                player2.addLast(player1Card);
                shuffleDeck(player2);
            } else {   // GO INTO WAR
                War(player1, player2, pile);
            }
        }

    }

    public void War(ArrayList<String> player1, ArrayList<String> player2, ArrayList<String> pile){

        System.out.println("WAR:");
        for(int i = 0; i<3; i++){
            if(player1.isEmpty() || player2.isEmpty()){
                return;
            } else{
                pile.addLast(player1.removeFirst());
                pile.addLast(player2.removeFirst());
            }
        }

        playRound(player1, player2, pile);
    }


}
