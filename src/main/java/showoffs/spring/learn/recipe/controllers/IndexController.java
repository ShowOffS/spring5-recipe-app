package showoffs.spring.learn.recipe.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import showoffs.spring.learn.recipe.services.RecipeService;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        log.debug("Getting index page here");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
