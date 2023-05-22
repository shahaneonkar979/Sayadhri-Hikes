package com.src.controller;

import javax.servlet.http.HttpSession;

import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.src.dao.TrekkerRepository;
import com.src.model.Trekker;

@Controller
public class HomeController {

	@Autowired
	TrekkerRepository trekkerRepo;
	
	@RequestMapping("/")
	public String home(Model model)
	{
	model.addAttribute("title","Home -SAHYADRI-VEDA");
	return "home";
	
	}	@RequestMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("title","About-SAHYADI-VEDA");
		return "about";
	}
	
	
	@RequestMapping("/signup")
	public String signup(Model model)
	{
	model.addAttribute("student",new Trekker());
	model.addAttribute("title","SignUp - SAHYADRI-VEDA");
	return "signup";
	}
}

	// @PostMapping("/do_register")
	//@RequestMapping(value="/do_register",method=RequestMethod.POST)
	//public String registerStudent(@ModelAttribute("trekker")Trekker student,@RequestParam(value="aggrement",defaultValue="false")boolean aggrement,Model model,HttpSession session)
	//{
	/*
	 * try { if(!aggrement){
	 * System.out.println("you have not aggred to terms and conditions"); throw new
	 * Exception("you have not aggred to terms and conditions"); }
	 * System.out.println("Aggrement"+aggrement);
	 * System.out.println("Trekker"+trekker);
	 * 
	 * Trekker result=this.trekkerRepo.save(trekker);
	 * model.addAttribute("trekker",new Trekker());
	 * 
	 * session.setAttribute("message", new
	 * Message("Successfully registered !!","alert-success")); return "signup";
	 * 
	 * } catch (Exception e) { e.printStackTrace(); model.addAttribute("student",
	 * student); session.setAttribute("message", new
	 * Message("Something went wrong !!"+e.getMessage(),"alert-danger")); return
	 * "signup"; } }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 */