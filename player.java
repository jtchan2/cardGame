

public class player {
    private int win;
    private int lose;
    public player(){
        win=0;
        lose=0;
    }
    public void won(){
        win++;
    }
    public void lost(){
        lose++;
    }
    public void winCount(){
        System.out.println("Player has won: "+win+" times");
    }
    public void losecount(){
        System.out.println("Player has lost: "+lose+" times");
    }
    public void getratioed(){
        System.out.println("W: "+win+"/ L: " +lose);
    }
}
