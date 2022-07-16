import java.util.LinkedList;
import java.util.Random;

public class deck {
    private LinkedList<card>cards;
    public deck(){
        this.cards= new LinkedList<card>();
    }
    public void makeDeck(){
        String [] suiteTypes= {"Diamond", "Club", "Heart", "Spade"};
        int point=0;
        for(int i=0; i<4; i++){
            for(int j=0; j<14; j++){
                String face="";
                point=j;
                if(j==0){
                    face="Ace";
                    point=11;
                }else if(j<11){
                    face= Integer.toString(j);
                }
                if(j==11){
                    face="Jack";
                    point=10;
                }
                if(j==12){
                    face="Queen";
                    point=10;
                }
                if(j==13){
                    face="King";
                    point=10;
                }
                card newCard= new card(suiteTypes[i], face,point);
                cards.add(newCard);
            }
        }
    }
    public void printDeck(){
        for(int i=0; i<cards.size(); i++){
            System.out.println(cards.get(i));
        }
    }
    public void shuffle(){
        Random ran = new Random();
        LinkedList<card> temp= new LinkedList<card>();
        while(cards.isEmpty()==false){
            int cardPos= ran.nextInt(cards.size());
            card cCard= cards.get(cardPos);
            temp.add(cCard);
            cards.remove(cardPos);
        }
        cards=temp;
    }
    public void addDeck(){}
    public void putCardBack(card Card){
        cards.add(Card);
    }
    public card giveCard(){
        return cards.pop();
    }
    public static void main(String[] args){
        deck deck1= new deck();
        deck1.makeDeck();
        deck1.printDeck();
        System.out.println("==================================================");
        deck1.shuffle();
        deck1.printDeck();
    }
}
