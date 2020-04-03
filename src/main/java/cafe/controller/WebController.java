package cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cafe.beans.Beverage;
import cafe.repository.BeverageRepository;

@Controller
public class WebController {
@Autowired
	BeverageRepository repo;

@GetMapping({ "/", "viewAll" })
public String viewAllBeverages(Model model) {
if(repo.findAll().isEmpty()) { return addNewBeverage(model);
}
model.addAttribute("beverages", repo.findAll());
return "results"; }

@GetMapping("/inputBeverage")
public String addNewBeverage(Model model) {
Beverage b = new Beverage(); model.addAttribute("newBeverage", b); return "input";
}

@PostMapping("/inputBeverage")
public String addNewBeverage(@ModelAttribute Beverage b,
Model model) {
repo.save(b);
     return viewAllBeverages(model);
}

@GetMapping("/edit/{id}")
public String showUpdateBeverage(@PathVariable("id") long id,
Model model) {
Beverage b = repo.findById(id).orElse(null);
model.addAttribute("newBeverage", b);
return "input"; }

@PostMapping("/update/{id}")
public String reviseBeverage(Beverage b, Model model) {
repo.save(b);
return viewAllBeverages(model); }

@GetMapping("/delete/{id}")
public String deleteUser(@PathVariable("id") long id, Model
model) {
Beverage b = repo.findById(id).orElse(null); repo.delete(b);
return viewAllBeverages(model);
	}

}

