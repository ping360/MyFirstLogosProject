package ua.com.forkShop.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.forkShop.entity.NameOfFeatureDigital;
import ua.com.forkShop.service.CategoryService;
import ua.com.forkShop.service.NameOfFeatureDigitalService;


@Controller
@RequestMapping("/admin/nameOfFeatureDigital")
@SessionAttributes("nameOfFeatureDigital")
public class NameOfFeatureDigitalController {

	@Autowired
	private NameOfFeatureDigitalService nameOfFeatureDigitalService;
	
	@Autowired
	private CategoryService categoryService;
	
	@ModelAttribute("nameOfFeatureDigital")
	public NameOfFeatureDigital getForm(){
		return new NameOfFeatureDigital();
	}
	
	@PostMapping
	public String save(@ModelAttribute("nameOfFeatureDigital")NameOfFeatureDigital nameOfFeatureDigital){
		nameOfFeatureDigitalService.save(nameOfFeatureDigital);
		return "redirect:/admin/nameOfFeatureDigital";
	}
	
	@RequestMapping
	public String show (Model model){
		model.addAttribute("nameOfFeatureDigitals", nameOfFeatureDigitalService.findAll());
		model.addAttribute("categories", categoryService.findAll());
		return "admin-nameOfFeatureDigital";
	
	}
	@GetMapping("/update/{id}")
	public String update (@PathVariable int id, Model model){
		model.addAttribute("nameOfFeatureDigital", nameOfFeatureDigitalService.findOne(id));
		return show(model);
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		nameOfFeatureDigitalService.delete(id);
		return "redirect:/admin/nameOfFeatureDigital";
	}
	
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/nameOfFeatureDigital";
	}
}