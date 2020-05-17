package com.example;

import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer bekham = new SoccerPlayer("Bekahm");

        Team<FootballPlayer> brisbane = new Team<>("brisbaneF");
        brisbane.addPlayer(joe);
      //  brisbane.addPlayer(pat);
      //  brisbane.addPlayer(bekham);

        System.out.println(brisbane.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("brisbaneB");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("brisbaneS");
        soccerTeam.addPlayer(bekham);

        Team<FootballPlayer> brisbane1 = new Team<>("brisbane1");
        Team<FootballPlayer> brisbane2 = new Team<>("brisbane2");
        Team<FootballPlayer> brisbane3 = new Team<>("brisbane3");

        brisbane.matchResult(brisbane1,3,2);
        brisbane.matchResult(brisbane2,2,0);
        brisbane1.matchResult(brisbane2,4,1);
        brisbane1.matchResult(brisbane3,4,1);


        System.out.println(brisbane.compareTo(brisbane1));
        System.out.println(brisbane1.compareTo(brisbane2));
        System.out.println(brisbane2.compareTo(brisbane1));




        LeagueTable<Team<FootballPlayer>> footballLeague = new LeagueTable<>("football");

        footballLeague.addTeam(brisbane);
        footballLeague.addTeam(brisbane1);
        footballLeague.addTeam(brisbane2);

        footballLeague.showLeague();

        //  footballLeague.addTeam(b);








    }
}
