// Original Work Created by Faizan Ishaq

import java.util.Random;
public class CardDeck {

    private int cardsInDeck = 52;
    private String[] deck;
    
    private static enum SUITS {
      CLUBS, DIAMONDS, HEARTS, SPADES
    }
   
    private static enum FACES {
      ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
   }

    public CardDeck() {
       int addedCards = 0;
       deck = new String[52];

          for(SUITS type : SUITS.values()) {
             for(FACES value : FACES.values()) {
                deck[addedCards] = value + " of " + type;
                addedCards++;
            } 
         }          
    }

    public int getCardsInDeck() {
        return this.cardsInDeck;
    }

    private void decrementCardsInDeck() {
        cardsInDeck--;
    }

    public void shuffle() {
        int indexHolder;
        String elementHolder;

        Random r = new Random();
        
        for(int i = 0; i < deck.length; i++) {
            indexHolder = r.nextInt(deck.length);
            elementHolder = deck[i];
            deck[i] = deck[indexHolder];
            deck[indexHolder] = elementHolder;
        }
    }

    public String dealOneCard() {
        String output = deck[cardsInDeck - 1];
        decrementCardsInDeck();
        return output;
    }
    
}