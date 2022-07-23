package ru.zychkov.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import ru.zychkov.tacocloud.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
