package OOP;

public class MainForFootballClub {
    public static void main(String[] args) {
        FootballClub club1 = new FootballClub("Barselona", new SoccerPlayer[]{
                new SoccerPlayer("Robert", "Levandovski", "Poland", "Attack"),
                new SoccerPlayer("Pablo", "Gavira", "Spain", "Atattacking midfielder"),
                new SoccerPlayer("Masur", "Dembele", "France", "Attack"),
                new SoccerPlayer("Pedro", "Gonsales", "Spain", "Atattacking midfielder"),
                new SoccerPlayer("Rafael", "Diaz", "Brazil", "Winger"),
                new SoccerPlayer("Ansumane", "Fati", "Spain", "Winger"),
                new SoccerPlayer("Frenkie", "de Jong", "Netherlands", "midfielder"),
                new SoccerPlayer("Jules", "Koundé", "France", "centre-back"),
                new SoccerPlayer("Ronald", "Silva", "Uruguay", "centre-back"),
                new SoccerPlayer("Ferran", "Torres", "Spain", "Winger"),
                new SoccerPlayer("Marc-Andre", "Stegen", "Germany", "Goalkeeper")
        });
        System.out.println(club1.playerInfo().getName());
        System.out.println(club1.playerInfo().getLastname());
        System.out.println(club1.playerInfo().getNationality());
        System.out.println(club1.playerInfo().getPosition());
    }
}
