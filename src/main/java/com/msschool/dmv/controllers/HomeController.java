// package com.msschool.dmv.controllers;

// import java.util.List;


// import com.msschool.dmv.models.License;
// import com.msschool.dmv.models.Person;
// import com.msschool.dmv.services.LicenseService;
// import com.msschool.dmv.services.PersonService;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;

// import java.security.Principal;
// import java.util.Date;
// import java.util.List;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpSession;
// import javax.validation.Valid;

// import org.springframework.validation.BindingResult;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

// import org.springframework.web.bind.annotation.RequestMapping;

// @Controller
// public class HomeController {
//     private PersonService pService;
// 	private LicenseService lService;
	

// 	public HomeController(PersonService pService, LicenseService lService){
//         this.pService = pService;
//         this.lService = lService;
//     }


// 	// @GetMapping("/home")
// 	// public String showhomePage(){
// 	// 	String hello = "Hello World my Darling";
// 	// 	System.out.println("Welcome to HomePage");
// 	// 	return ""+hello;
// 	// }
// 	@GetMapping("/home")
// 	public String index(Model model){
        
//         List<Person> allPs = pService.findAll();
//         List<License> allLs = lService.findAll();
//         model.addAttribute("allps", allPs);
//         model.addAttribute("allls", allLs);
       
//         // model.addAttribute("personObj", pService.findAll());
//         // model.addAttribute("licenseObj", lService.findAll());
//         System.out.println("hello from controller");
		
// 		return "index";
//     }

    

// 	// @GetMapping("/home")
// 	// public String index(@ModelAttribute("personObj") Person person, @ModelAttribute("licenseObj") License license, Model model){
        
//     //     // List<Person> allPs = pService.findAll();
//     //     // List<License> allLs = lService.findAll();
//     //     // model.addAttribute("allps", allPs);
//     //     // model.addAttribute("allls", allLs);
       
//     //     // model.addAttribute("personObj", pService.findAll());
//     //     // model.addAttribute("licenseObj", lService.findAll());
//     //     System.out.println("hello from controller");
		
// 	// 	return "index";
//     // }
    
// //     @GetMapping("/home/person/new")
// // 	public String createUser(@ModelAttribute("personObj") Person person, BindingResult res, Model model) {
// //         // pService.createPerson(person);
// //         List<Person> allPs = pService.findAll();
// //         List<License> allLs = lService.findAll();
// //         model.addAttribute("allps", allPs);
// //         model.addAttribute("allls", allLs);
// // 		return "index";
// // 	}
// //     @PostMapping("/home/person/new")
// //     public String addNewPerson(@Valid @ModelAttribute("personObj") Person person, BindingResult result){
// //         if(result.hasErrors()){
// //             return "redirect:/person/new";
// //         } else {
// // //            Person newPerson = pS.createPerson(person);
// //             pService.createPerson(person);
// //             return "redirect:/home";

// //         }

// //     }



//     @GetMapping("/home/person/new")
//     public String getNewPerson(@ModelAttribute("personObj") Person person){
//         return "index";
//     }

//     @PostMapping("/home/person/new")
//     public String addNewPerson(@Valid @ModelAttribute("personObj") Person person, BindingResult result){
//         if(result.hasErrors()){
//             return "redirect:/home/person/new";
//         } else {
// //            Person newPerson = pS.createPerson(person);
//             pService.createPerson(person);
//             return "redirect:/home";

//         }

//     }


    

// 	@PostMapping("/home/license/new")
// 	public String create(@Valid @ModelAttribute("licenseObj") License license){
// 		lService.createLicense(license);
// 		return "redirect:/home";
//     }
    
//     @GetMapping("/home/add")
//     public String addPage( Model model ){
// 		List<Person> allPs = pService.findAll();
//         List<License> allLs = lService.findAll();
//         model.addAttribute("allps", allPs);
//         model.addAttribute("allls", allLs);

// 		return "index";
//     }

// 	@PostMapping("/home/add")
// 	public String add( @RequestParam("licenseObj") long licenseId, @RequestParam("personObj") long personId ){
// 		License license = lService.getById(licenseId);
// 		Person person  = pService.getById(personId);

// 		List<Person> persons =  (List<Person>) license.getPerson();
//         persons.add(person);
        

// 		lService.update(license);

// 		return "redirect:/home";
//     }
    
// }