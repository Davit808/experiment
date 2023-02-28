package OOP;

public class FootballClub {
    private final String ClubName;
    private final SoccerPlayer[] players = new SoccerPlayer[33];
    private String playerName;
    private String playerLastName;
    private String playerNationality;
    private String playerPosition;
    private
    int numberOfPlayer = 1;
    FootballClub(String CN, SoccerPlayer[] info) {
        ClubName = CN;
        if (info.length < 11){
            System.exit(1);
        }
        for (int i = 0; i < info.length; i++) {
            players[i] = info[i];
        }
        playerName = playerName();
        playerLastName = playerLastName();
        playerNationality = playerNationality();
        playerPosition = playerPosition();
    }

    public String playerName() {
        this.playerName = players[numberOfPlayer - 1].getName();
        if (playerName.length() == 0){
            System.exit(1);
        }
        return playerName;
    }

    public String playerLastName() {
        playerLastName = players[numberOfPlayer - 1].getLastname();
        if (playerLastName.length() == 0){
            System.exit(1);
        }
        return playerLastName;
    }

    public String playerNationality() {
        playerNationality = players[numberOfPlayer - 1].getNationality();
        if (playerNationality.length() == 0){
            System.exit(1);
        }
        return playerNationality;
    }

    public String playerPosition() {
        playerPosition = players[numberOfPlayer - 1].getPosition();
        if (playerPosition.length() == 0){
            System.exit(1);
        }
        return playerPosition;
    }

    public void setNumberOfPlayer(int number) {
        if (number > players.length) {
            System.exit(1);
        } else {
            this.numberOfPlayer = number;
        }
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public String getClubName() {
        return ClubName;
    }
}
