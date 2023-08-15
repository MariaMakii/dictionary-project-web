package dictionary.application;

import dictionary.application.model.DictionaryShell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
@Component
public class HomePageController {

    @Autowired
    @Qualifier("availableDictionaries")
    private ArrayList<DictionaryShell> availableDictionaries;

    @GetMapping("/")
    public String goToHomePage(Model model){
        System.out.println("IN Home Controller");
        model.addAttribute("dictionaries", availableDictionaries);
        return "home";
    }
}
