package fr.portfolio.portfolio.controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.core.joran.conditional.ElseAction;
import fr.portfolio.portfolio.entities.Project;
import fr.portfolio.portfolio.repositories.ProjectRepository;

@Controller
class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/")
    public String project(Model model) {
        List<Project> projects = projectRepository.findAll();
        model.addAttribute("projects", projects);
        return "index";
    }

    @GetMapping("/admin")
    public String manageProject(Project project, Model model)  {
            List<Project> projects = projectRepository.findAll();
             model.addAttribute("projects", projects);
        return "admin";
    }

    @PatchMapping("/admin/{id}")
    @ResponseBody
    public Project displayProject(@PathVariable Long id, @RequestParam Boolean active) {
        Project project = projectRepository.getOne(id);

        project.setActive(active);

        return projectRepository.save(project);
    }

    @GetMapping("/contact")
    public String contact (Model model) {
        return "contact";
    }
}