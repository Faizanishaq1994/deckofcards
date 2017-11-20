// Original Work Created by Faizan Ishaq

import javax.swing.JOptionPane;
public class DealCards {
    public static void main(String[] args) {

        CardDeck d = new CardDeck();
        d.shuffle();
        dealCards(d);
        output(d);

    }

    public static void dealCards(CardDeck d) {
        int choice;

        do {

            choice = JOptionPane.showConfirmDialog(null,"Would you like to be dealt a card? \n" + d.getCardsInDeck()
                    + " card(s) currently in the deck","Card Dealer", JOptionPane.YES_NO_OPTION);

            if(d.getCardsInDeck() == 0 && choice == 0) {
                JOptionPane.showMessageDialog(null, "The deck is empty. No card is dealt!");
                choice = -1;
            }

            if(d.getCardsInDeck() > 0 && choice == 0) {
                JOptionPane.showMessageDialog(null, "You Received the " + d.dealOneCard());
            }

        }while(choice == 0);
    }

    public static void output(CardDeck d) {

        if(d.getCardsInDeck() > 0) {
            JOptionPane.showMessageDialog(null, "You are left with " + d.getCardsInDeck() + " cards in the deck. Thanks for playing!");
        }

        else {
            JOptionPane.showMessageDialog(null, "No cards are left in the deck. Thanks for playing!");
        }

    }

}