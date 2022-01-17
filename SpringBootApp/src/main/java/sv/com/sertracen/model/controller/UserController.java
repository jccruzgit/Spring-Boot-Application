package sv.com.sertracen.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import sv.com.sertracen.model.entity.Role;

@Controller
public class UserController {

	private final String TAB_FORM = "formTab";
	private final String TAB_LIST = "listTab";
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/userForm")
	public String userForm() {
		return "user-form";
	}
}