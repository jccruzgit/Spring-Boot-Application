package sv.com.sertracen.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sv.com.sertracen.model.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

	public Role findByName(String role);
}
