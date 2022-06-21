package ru.zychkov.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import ru.zychkov.tacocloud.TacoOrder;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {

}
