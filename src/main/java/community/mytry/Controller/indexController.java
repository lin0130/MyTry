package community.mytry.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class indexController {
    @GetMapping("/hello")
    public String index(Model model, @RequestParam(name = "Name") String name)
    {
        model.addAttribute("name",name);
        return "hello";
    }
}
