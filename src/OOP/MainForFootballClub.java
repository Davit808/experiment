package OOP;

public class MainForFootballClub {
    public static void main(String[] args) {
        SoccerPlayer p1 = new SoccerPlayer("Robert", "Levandovski", "Poland", "Attack");
        SoccerPlayer p2 = new SoccerPlayer("Pablo", "Gavira", "Spain", "Atattacking midfielder");
        SoccerPlayer p3 = new SoccerPlayer("Masur", "Dembele", "France", "Attack");
        SoccerPlayer p4 = new SoccerPlayer("Pedro", "Gonsales", "Spain", "Atattacking midfielder");
        SoccerPlayer p5 = new SoccerPlayer("Rafael", "Diaz", "Brazil", "Winger");
        SoccerPlayer p6 = new SoccerPlayer("Ansumane", "Fati", "Spain", "Winger");
        SoccerPlayer p7 = new SoccerPlayer("Frenkie", "de Jong", "Netherlands", "midfielder");
        SoccerPlayer p8 = new SoccerPlayer("Jules", "Koundé", "France", "centre-back");
        SoccerPlayer p9 = new SoccerPlayer("Ronald", "Silva", "Uruguay", "centre-back");
        SoccerPlayer p10 = new SoccerPlayer("Ferran", "Torres", "Spain", "Winger");
        SoccerPlayer p11 = new SoccerPlayer("Marc-Andre", "Stegen", "Germany", "Goalkeeper");
        SoccerPlayer p12 = new SoccerPlayer("", "", "", "");
        SoccerPlayer p13 = new SoccerPlayer("Maradona", "", "", "Attack");

        FootballClub club1 = new FootballClub("Barselona", new SoccerPlayer[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13});

        club1.setNumberOfPlayer(2);
        System.out.println(club1.getNumberOfPlayer());
        System.out.println(club1.playerName());
        System.out.println(club1.playerLastName());
        System.out.println(club1.playerNationality());
        System.out.println(club1.playerPosition());

        club1.setNumberOfPlayer(13);
        System.out.println(club1.playerPosition());
        System.out.println(club1.playerNationality());
    }
}
