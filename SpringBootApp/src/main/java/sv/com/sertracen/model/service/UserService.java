package sv.com.sertracen.model.service;

import sv.com.sertracen.model.dto.ChangePasswordForm;
import sv.com.sertracen.model.entity.User;
import sv.com.sertracen.model.exception.UsernameOrIdNotFound;

public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;

	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
	
	public void deleteUser(Long id) throws UsernameOrIdNotFound;
	
	public User changePassword(ChangePasswordForm form) throws Exception;

}
