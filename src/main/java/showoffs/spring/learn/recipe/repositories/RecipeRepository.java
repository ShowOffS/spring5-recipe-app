package showoffs.spring.learn.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import showoffs.spring.learn.recipe.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
