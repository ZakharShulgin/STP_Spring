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

    public void incrementGame(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        team.setGames(team.getGames() + 1);
        teamRepository.save(team);
    }

    public void decrementGame(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        if (team.getGames() != 0) {
            team.setGames(team.getGames() - 1);
        }
        teamRepository.save(team);
    }

    public void incrementWin(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        team.setWin(team.getWin() + 1);
        teamRepository.save(team);
    }

    public void decrementWin(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        if (team.getWin() != 0) {
            team.setWin(team.getWin() - 1);
        }
        teamRepository.save(team);
    }

    public void incrementDraw(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        team.setDraw(team.getDraw() + 1);
        teamRepository.save(team);
    }

    public void decrementDraw(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        if (team.getDraw() != 0) {
            team.setDraw(team.getDraw() - 1);
        }
        teamRepository.save(team);
    }

    public void incrementLose(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        team.setLose(team.getLose() + 1);
        teamRepository.save(team);
    }

    public void decrementLose(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        if (team.getLose() != 0) {
            team.setLose(team.getLose() - 1);
        }
        teamRepository.save(team);
    }

    public void incrementPoint(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        team.setPoints(team.getPoints() + 1);
        teamRepository.save(team);
    }

    public void decrementPoint(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        if (team.getPoints() != 0) {
            team.setPoints(team.getPoints() - 1);
        }
        teamRepository.save(team);
    }

    public void incrementBall(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        team.setBalls(team.getBalls() + 1);
        teamRepository.save(team);
    }

    public void decrementBall(long id) {
        Optional<Team> teamData = teamRepository.findById(id);
        Team team = teamData.get();
        if (team.getBalls() != 0) {
            team.setBalls(team.getBalls() - 1);
        }
        teamRepository.save(team);
    }

}
