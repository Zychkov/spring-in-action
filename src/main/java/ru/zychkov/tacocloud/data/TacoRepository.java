package ru.zychkov.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import ru.zychkov.tacocloud.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
