package showoffs.spring.learn.recipe.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import showoffs.spring.learn.recipe.models.Recipe;
import showoffs.spring.learn.recipe.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        log.debug("Size of recipe is " + recipeSet.size());
        return recipeSet;
    }
}
