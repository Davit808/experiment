package OOP;

public class FootballClub {
    private String ClubName;
    private SoccerPlayer[] players;

    FootballClub(String CN, SoccerPlayer[] info) {
        ClubName = CN;
        players = new SoccerPlayer[info.length];
        for (int i = 0; i < players.length; i++) {
            players[i] = info[i];
        }
        // players = info;
    }

}
