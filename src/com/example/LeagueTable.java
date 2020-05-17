package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {

    private  String name;

    ArrayList<T> league = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public void addTeam(T team){
        league.add(team);

    }

    public void showLeague(){

        Collections.sort(league);
        for(T t:league)
            System.out.println(t.getName());
    }
}


