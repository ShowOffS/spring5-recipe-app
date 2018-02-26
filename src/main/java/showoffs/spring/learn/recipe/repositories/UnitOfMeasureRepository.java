package showoffs.spring.learn.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import showoffs.spring.learn.recipe.models.Recipe;
import showoffs.spring.learn.recipe.models.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
