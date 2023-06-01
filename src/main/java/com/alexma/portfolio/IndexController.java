package com.alexma.portfolio;

import com.alexma.portfolio.aboutme.AboutMeRepository;
import com.alexma.portfolio.contact.ContactRepository;
import com.alexma.portfolio.contactform.User;
import com.alexma.portfolio.contactform.UserRepository;
import com.alexma.portfolio.inicio.InicioRepository;
import com.alexma.portfolio.project.ProjectRepository;
import com.alexma.portfolio.skillsecondary.SkillCardSecondarRepository;
import com.alexma.portfolio.skillsecondary.SkillCardSecondary;
import com.alexma.portfolio.skillsmain.SkillCardMain;
import com.alexma.portfolio.skillsmain.SkillCardMainRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class IndexController {
    private final InicioRepository InicioRepository;
    private final AboutMeRepository AboutMeRepository;
    private final SkillCardMainRepository SkillCardMainRepository;
    private final SkillCardSecondarRepository SkillCardSecondarRepository;
    private final ContactRepository ContactRepository;
    private final ProjectRepository ProjectRepository;

    private final UserRepository UserRepository;

    public IndexController(InicioRepository InicioRepository, com.alexma.portfolio.inicio.InicioRepository inicioRepository, com.alexma.portfolio.aboutme.AboutMeRepository aboutMeRepository, SkillCardMainRepository skillCardMainRepository, SkillCardSecondarRepository skillCardSecondarRepository, ContactRepository ContactRepository, ProjectRepository ProjectRepository, UserRepository UserRepository) {
        this.InicioRepository = inicioRepository;
        this.AboutMeRepository = aboutMeRepository;
        this.SkillCardMainRepository = skillCardMainRepository;
        this.SkillCardSecondarRepository = skillCardSecondarRepository;
        this.ContactRepository = ContactRepository;
        this.ProjectRepository = ProjectRepository;
        this.UserRepository = UserRepository;
    }

    @GetMapping("/")
    public String index(Model modelo) {
        modelo.addAttribute("inicio", InicioRepository.findAll());
        modelo.addAttribute("aboutme", AboutMeRepository.findAll());
        modelo.addAttribute("skillmain", SkillCardMainRepository.findAll());
        modelo.addAttribute("skillsecondary", SkillCardSecondarRepository.findAll());
        modelo.addAttribute("contact", ContactRepository.findAll());
        modelo.addAttribute("project", ProjectRepository.findAll());
        return "/index";
    }

    @PostMapping("/saveUser")
    public String addNewUser(@RequestParam String  name, @RequestParam String email, @RequestParam String message) {
        User user = new User(name, email, message);
        UserRepository.save(user);
        return "redirect:/";
    }
}
