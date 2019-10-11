package fr.portfolio.portfolio.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.portfolio.portfolio.entities.Project;
import fr.portfolio.portfolio.repositories.ProjectRepository;

@Component
public class ProjectOutputter implements CommandLineRunner {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void run(String... args) throws Exception {

        projectRepository.deleteAll();

        Project[] data = new Project[] {
                new Project("Book des anciens", true,
                        "Créer un book des anciens élève de la Wild Code School totalement responsive",
                        "/img/book1.png", "https://github.com/BryanNun/bookancien"),
                new Project("Bandersnatch", true, "Réalisation d'un jeu d'aventure en Java", "/img/Bandersnatch.png",
                        "https://github.com/WildCodeSchool/reims-0519-spring-bandersnatch/tree/dev"),
                new Project("Burger Run", true, "Création lors d'un hackaton de 3 jours, d'un jeu type Pacman en Java",
                        "/img/BurgerRun.png", "https://github.com/WildCodeSchool/reims-0519-java-burger-run"),
                new Project("TerraSolis", true,
                        "Création lors d'un hackaton de 2 jours, d'un agenda conceptuel pour l'association Terrasolis",
                        "/img/Terrasolis.png",
                        "https://github.com/WildCodeSchool/reims-0519-java-hackathon2-novumligno/tree/dev"),
                new Project("Wild Circus", true, "Checkpoint de fin de Promotion à la Wild Code School",
                        "/img/repo.png", "hhttps://github.com/Seb-Dupuis/WildcircusCheckpoint"),
                new Project("Find the Precious", true, "Mon premier site web responsive", "/img/find.png",
                        "https://github.com/Seb-Dupuis/FindThePrecious"),
                new Project("BlackJack", true,
                        "Réalisation d'un jeu de BlackJack en java utilisable avec un terminal de command",
                        "/img/blackjack.png", "https://github.com/Seb-Dupuis/BlackJack/tree/dev"),
                new Project("Angular Project", true, "Projet de blog avec Angular", "/img/angu.png",
                        "https://github.com/Seb-Dupuis/Angular-project")

        };

        for (Project project : data) {
            projectRepository.save(project);
        }
    }

}