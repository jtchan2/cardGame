import java.util.ArrayList;

public class blackjack {
    private deck mainDeck;
    private final int BJ=21;
    private final int houseStand=17;
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
        String userInput="";
        boolean stop=false;
        card holder= mainDeck.giveCard();
        P1.add(holder);
        holder=mainDeck.giveCard();
        House.add(holder);
        p1Score=getHandWorth(P1);
        houseScore=getHandWorth(House);
        if(blackJack(houseScore)){
            if(blackJack(p1Score)){
                System.out.println("PUSH");
            }else{
                System.out.println("House Wins Black Jack");
            }
        }else{
            if(blackJack(p1Score)){
                System.out.println("Player wins Black Jack");
                return;
            }
            while(stop==false && p1Score<=21){
                System.out.println("Hit?");
                if(userInput.toUpperCase()=="Y"){
                    P1.add(mainDeck.giveCard());
                    p1Score=getHandWorth(P1);
                }else{
                    stop=true;
                }
                if(p1Score>21){
                    System.out.println("User Loses, Broke");
                }
            }

        }
    }
    public boolean overtop(int points){
        if(points>21){return true;}
        return false;
    }
    public boolean houseMax(int points){
        if(points>=houseStand){
            return true;
        }
        return false;
    }
    public boolean blackJack(int points){
        if(points==BJ){
            return true;
        }
        return false;
    }
    public ArrayList<card> split(ArrayList<card> hand){
        ArrayList<card> hand2= new ArrayList<card>();
        hand2.add(hand.remove(1));
        return hand2;
    }
    public boolean isSpiltPoss(ArrayList<card> hand){
        if(hand.get(0).getFace()==hand.get(1).getFace()){
            return true;
        }
        return false;
    }
    public int getHandWorth(ArrayList<card> hand){
        int total=0;
        for(int i=0; i<hand.size(); i++){
            total+=hand.get(i).getPoint();
        }
        return total;
    }
    public void hit(deck Deck, ArrayList<card> hand){
        card drawed= Deck.giveCard();
        hand.add(drawed);
    }
}
