package showoffs.spring.learn.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import showoffs.spring.learn.recipe.models.Category;
import showoffs.spring.learn.recipe.models.Recipe;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
