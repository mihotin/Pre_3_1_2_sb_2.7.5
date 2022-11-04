package Pre_3_1_2_sd_275.controller;

import Pre_3_1_2_sd_275.model.User;
import Pre_3_1_2_sd_275.repositorys.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping()
    public String showUser(Principal principal, Model model) {
        User user = userRepo.findByFirstName(principal.getName());
        model.addAttribute("user", user);
        return "user/user";
    }
}


