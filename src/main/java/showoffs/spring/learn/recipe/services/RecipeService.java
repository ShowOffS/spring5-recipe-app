package showoffs.spring.learn.recipe.services;

import showoffs.spring.learn.recipe.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
