package ua.com.forkShop.controller.user;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.com.forkShop.entity.User;
import ua.com.forkShop.service.CategoryService;
import ua.com.forkShop.service.ItemService;
import ua.com.forkShop.service.UserService;

@Controller
public class IndexComtroller {

	@Autowired
	private UserService userService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ItemService itemService;

	@RequestMapping("/category/{id}")
	public String category(@PathVariable int id, Model model) {
		model.addAttribute("category", categoryService.findOne(id));
		model.addAttribute("items", itemService.findByCategoryId(id));
		return "user-category";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "admin-admin";
	}

	@RequestMapping("/")
	public String index(Principal principal){
		if(principal!=null){
			System.out.println(principal.getName());
		}
		return "user-index";
	}
	
	@GetMapping("/registration")
	public String registration(Model model){
		model.addAttribute("user", new User());
		return "user-registration";
	}
	
	@PostMapping("/registration")
	public String save(@ModelAttribute("user") User user){
		userService.save(user);
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String login(){
		return "user-login";
	}
}
