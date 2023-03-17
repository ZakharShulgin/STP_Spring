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

    @RequestMapping("/incrementGame/{id}")
    public String incrementGame(@PathVariable long id) {
        teamService.incrementGame(id);
        return "redirect:/";
    }

    @RequestMapping("/decrementGame/{id}")
    public String decrementGame(@PathVariable long id) {
        teamService.decrementGame(id);
        return "redirect:/";
    }
    @RequestMapping("/incrementWin/{id}")
    public String incrementWin(@PathVariable long id) {
        teamService.incrementWin(id);
        return "redirect:/";
    }

    @RequestMapping("/decrementWin/{id}")
    public String decrementWin(@PathVariable long id) {
        teamService.decrementWin(id);
        return "redirect:/";
    }

    @RequestMapping("/incrementDraw/{id}")
    public String incrementDraw(@PathVariable long id) {
        teamService.incrementDraw(id);
        return "redirect:/";
    }

    @RequestMapping("/decrementDraw/{id}")
    public String decrementDraw(@PathVariable long id) {
        teamService.decrementDraw(id);
        return "redirect:/";
    }

    @RequestMapping("/incrementLose/{id}")
    public String incrementLose(@PathVariable long id) {
        teamService.incrementLose(id);
        return "redirect:/";
    }

    @RequestMapping("/decrementLose/{id}")
    public String decrementLose(@PathVariable long id) {
        teamService.decrementLose(id);
        return "redirect:/";
    }

    @RequestMapping("/incrementPoint/{id}")
    public String incrementPoint(@PathVariable long id) {
        teamService.incrementPoint(id);
        return "redirect:/";
    }

    @RequestMapping("/decrementPoint/{id}")
    public String decrementPoint(@PathVariable long id) {
        teamService.decrementPoint(id);
        return "redirect:/";
    }

    @RequestMapping("/incrementBall/{id}")
    public String increment(@PathVariable long id) {
        teamService.incrementBall(id);
        return "redirect:/";
    }

    @RequestMapping("/decrementBall/{id}")
    public String decrement(@PathVariable long id) {
        teamService.decrementBall(id);
        return "redirect:/";
    }
}