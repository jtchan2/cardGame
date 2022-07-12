import java.util.ArrayList;

public class blackjack {
    private deck mainDeck;
    private final int harddeck=21;
    public blackjack(){
        mainDeck= new deck();
    }
    public void setup(){
        mainDeck.makeDeck();
        mainDeck.shuffle();
    }
    public void play(player Player1){
        ArrayList<card> P1= new ArrayList<card>();
        ArrayList<card> House= new ArrayList<card>();
        int p1Score=0;
        int houseScore=0;
        card holder= mainDeck.giveCard();
        P1.add(holder);
        holder=mainDeck.giveCard();
        House.add(holder);
        p1Score=checkHandWorth(P1);
        houseScore=checkHandWorth(House);
        if(p1Score==21 &&houseScore==21){
            System.out.println("Draw");
        }else if(houseScore==21){
            System.out.println("House Wins");
        }
        else if(p1Score==21){
            System.out.println("Player wins");
        }

    }
    public int checkHandWorth(ArrayList<card> hand){
        int total=0;
        for(int i=0; i<hand.size(); i++){
            total+=hand.get(i).getPoint();
        }
        return total;
    }
}
