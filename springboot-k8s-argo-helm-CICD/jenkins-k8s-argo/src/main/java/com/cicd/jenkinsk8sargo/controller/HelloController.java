import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RestController
public class HelloController{
  

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "I have successfuly built a spring boot application using Maven");
        model.addAttribute("msg", "This application is deployed on to Kubernetes using Argo CD");
        return "index";
    }
}
