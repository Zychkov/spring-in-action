package ru.zychkov.tacocloud.data;

import ru.zychkov.tacocloud.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
