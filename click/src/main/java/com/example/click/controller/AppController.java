package com.example.click.controller;

import com.example.click.model.Team;
import com.example.click.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private TeamService teamService;

    @RequestMapping("/")
    public String getStart(Model model){
        List<Team> teams = teamService.getAllTeams();
        model.addAttribute("teams", teams);
        return "main";
    }

    @RequestMapping("/increment/{id}")
    public String increment(@PathVariable long id) {
        teamService.increment(id);
        return "redirect:/";
    }

    @RequestMapping("/decrement/{id}")
    public String decrement(@PathVariable long id) {
        teamService.decrement(id);
        return "redirect:/";
    }
}