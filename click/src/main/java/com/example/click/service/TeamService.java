package com.example.click.service;

import com.example.click.model.Team;
import com.example.click.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams(){
        return teamRepository.findAll();
    }

    public void increment(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        team.setClickCount(team.getClickCount() + 1);
        teamRepository.save(team);
    }

    public void decrement(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        if (team.getClickCount() != 0) {
            team.setClickCount(team.getClickCount() - 1);
        }
        teamRepository.save(team);
    }

}
