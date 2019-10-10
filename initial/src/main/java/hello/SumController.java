package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController{
    @GetMapping("/sum")
    public String addMethod(@RequestParam(name="a") int a, @RequestParam(name="b") int b, Model model) {
        model.addAttribute("result", a+b);
        return "sum";
    }
}
