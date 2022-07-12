//import java.util.*;
public class card {
    private String face;
    private String suite;
    private int points;
    public card(){
        this.face="";
        this.suite="";
        this.points=0;
    }
    public card(String cFace, String cSuite, int point){
        this.face=cFace;
        this.suite=cSuite;
        this.points=point;
    }
    public void setFace(String face){
        this.face=face;
    }
    public void setSuite(String worth){
        this.suite=worth;
    }
    public void setPoint(int num){
        this.points=num;
    }
    public String getFace(){
        return this.face;
    }
    public String getSuite(){
        return this.suite;
    }
    public int getPoint(){
        return this.points;
    }
    public String toString(){
        String statement="";
        statement+="Face :" +this.face+" Suite :" +this.suite +" Worth :"+this.points;
        return statement;
    }
}
