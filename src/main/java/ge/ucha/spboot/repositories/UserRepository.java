package ge.ucha.spboot.repositories;

import ge.ucha.spboot.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
