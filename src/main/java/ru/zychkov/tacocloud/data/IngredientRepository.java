package ru.zychkov.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import ru.zychkov.tacocloud.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
