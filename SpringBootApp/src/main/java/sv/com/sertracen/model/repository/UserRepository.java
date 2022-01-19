package sv.com.sertracen.model.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sv.com.sertracen.model.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	public Optional<User> findByUsername(String username);
}
