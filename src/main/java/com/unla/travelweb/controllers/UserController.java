package com.unla.travelweb.controllers;	



import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.unla.travelweb.entities.Carrito;
import com.unla.travelweb.entities.User;
import com.unla.travelweb.entities.UserRole;
import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.repositories.ICarritoRepository;
import com.unla.travelweb.repositories.IUserRepository;
import com.unla.travelweb.repositories.IUserRoleRepository;
import com.unla.travelweb.services.implementation.UserRoleService;
import com.unla.travelweb.services.implementation.UserService;	


@Controller	
public class UserController {	

	@Autowired
	@Qualifier("userRepository")
	private IUserRepository userRepository;
	@Autowired
	@Qualifier("userRoleRepository")
	private IUserRoleRepository userRoleRepository;
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	@Autowired
	@Qualifier("userRoleService")
	private UserRoleService userRoleService;
	@Autowired
	@Qualifier("carritoRepository")
	private ICarritoRepository carritoRepository;
	
	@GetMapping("/login")	
	public String login(Model model,	
						@RequestParam(name="error",required=false) String error,	
						@RequestParam(name="logout", required=false) String logout) {	
		model.addAttribute("error", error);	
		model.addAttribute("logout", logout);
		
		String username = "";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
		  username = ((UserDetails)principal).getUsername();
		}
		System.out.println(username);
		if(!username.isEmpty()) {
			System.out.println("Ya esta logueado. Primero deberia desloguearse");
			return "redirect:/index";
		}
		else {
			return ViewRouteHelper.USER_LOGIN;
		}
	}	

	@GetMapping("/logout")	
	public String logout(Model model) {	
		String username = "";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
		  username = ((UserDetails)principal).getUsername();
		}
		System.out.println(username);
		if(username.isEmpty()) {
			System.out.println("no hay ninguna cuenta logueada");
			return "redirect:/index";	
		}
		else return ViewRouteHelper.USER_LOGOUT;	
	}	

	@GetMapping("/loginsuccess")	
	public String loginCheck() {	
		return "redirect:/index";	
	}	
	
	@GetMapping("/register")	
	public ModelAndView showRegistrationPage(User user){
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.USER_REGISTER);
		mAV.addObject("user", user);
		return mAV;
	}
	
	@PostMapping("/register")
	public String processRegistrationForm(ModelAndView modelAndView, @Valid User user, BindingResult bindingResult, HttpServletRequest request) {
		User userExists = userRepository.findByUsernameAndFetchUserRolesEagerly(user.getUsername());		

		if (userExists != null) {
			modelAndView.addObject("alreadyRegisteredMessage", "Ya hay un usuario registrado con ese nombre");
			modelAndView.setViewName("register");
		}
		BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
		String password = pe.encode(user.getPassword());
		user.setPassword(password);
		user.setEnabled(true);	
		Set<UserRole> listarole = new HashSet<UserRole>();
		UserRole u = new UserRole(user, "ROLE_USER");
		userRoleService.saveUser(u);
		listarole.add(u);
		user.setUserRoles(listarole);
		
		//Le creo un carrito
		Carrito c = new Carrito();
		carritoRepository.save(c);
		user.setCarrito(c);
		
		userService.saveUser(user);				
		return "redirect:/login";
	}
	
	
}