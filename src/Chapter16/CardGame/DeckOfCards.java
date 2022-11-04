package Chapter16.CardGame;
import java.util.*;

public class DeckOfCards {
    private List<Cards> list;

    public DeckOfCards(){
        Cards[] deck = new Cards[52];
        int count = 0;
        for(Cards.Suit suit : Cards.Suit.values()){
            for(Cards.Face face : Cards.Face.values()){
                deck[count] = new Cards(face, suit);
                count++;
            }
        }

        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }

    public void printCards(){
        for(int i = 0; i < list.size(); i++){
            System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? System.lineSeparator() : "");
        }
    }

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.printCards();
    }
}
