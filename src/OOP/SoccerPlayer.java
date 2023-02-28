package OOP;

public class SoccerPlayer {
   private  String name;
   private  String lastname;
   private  String nationality;
   private  String position;


    SoccerPlayer(String n, String ln, String na, String p){
        name = n;
        lastname = ln;
        nationality = na;
        position = p;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPosition() {
        return position;
    }
}
