import java.util.LinkedList;

public class deck {
    private LinkedList<card>cards;
    public deck(){
        this.cards= new LinkedList<card>();
    }
    public void makeDeck(){
        String [] suiteTypes= {"Diamond", "Club", "Heart", "Spade"};
        for(int i=0; i<4; i++){
            for(int j=0; j<14; j++){
                String face="";
                if(j==0){
                    face="Ace";
                }else if(j<11){
                    face= Integer.toString(j);
                }
                if(j==11){
                    face="Jack";
                }
                if(j==12){
                    face="Queen";
                }
                if(j==13){
                    face="King";
                }
                card newCard= new card(suiteTypes[i], face);
                cards.add(newCard);
            }
        }
    }
    public void printDeck(){
        for(int i=0; i<cards.size(); i++){
            System.out.println(cards.get(i));
        }
    }
    public static void main(String[] args){
        deck deck1= new deck();
        deck1.makeDeck();
        deck1.printDeck();
    }
}
