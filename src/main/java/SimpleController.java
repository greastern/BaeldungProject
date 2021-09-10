import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    @Value("${spring.LoopFromHackerRank.name}") //I changed name from {spring.application.name} to {spring.LoopFromHackerRank.name} is that okay?
    String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("LoopFromHackerRank", appName); // also changed model.addAttribute("appName", appName); to model.addAttribute("LoopFromHackerRank", appName);
        return "home";
    }
}
