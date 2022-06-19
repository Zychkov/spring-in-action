package ru.zychkov.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import ru.zychkov.tacocloud.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
