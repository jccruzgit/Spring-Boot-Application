package sv.com.sertracen.model.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.com.sertracen.model.entity.Role;
import sv.com.sertracen.model.entity.User;
import sv.com.sertracen.model.repository.RoleRepository;
import sv.com.sertracen.model.service.UserService;

@Controller
public class UserController {

	private final String TAB_FORM = "formTab";
	private final String TAB_LIST = "listTab";
	
	@Autowired
	UserService userService;
	
	@Autowired
	RoleRepository roleRepository;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/userForm")
	public String signup(Model model) {
		Role userRole = roleRepository.findByName("USER");
		List<Role> roles = Arrays.asList(userRole);
		
		model.addAttribute("signup",true);
		model.addAttribute("userForm", new User());
		model.addAttribute("roles",roles);
		return "user-form/user-signup";
	}
}