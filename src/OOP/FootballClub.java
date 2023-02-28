package OOP;

public class FootballClub {
    private String ClubName;
    private SoccerPlayer[] players = new SoccerPlayer[33];
    private SoccerPlayer playerInfo;
    private int numberOfPlayer = 1;

    FootballClub(String CN, SoccerPlayer[] info) {
        players = info;
        playerInfo = playerInfo();
    }

    public SoccerPlayer playerInfo(){
        playerInfo = players[numberOfPlayer-1];
        return playerInfo;
    }
    public void setNumberOfPlayer(int number) {
        if (number > players.length || number < 1) {
            System.exit(1);
        } else {
            this.numberOfPlayer = number;
        }
    }
}
