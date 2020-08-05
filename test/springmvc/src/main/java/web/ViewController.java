package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {

	@RequestMapping("")
	public String show(Model model) {
		System.out.print("__________________________________________________________\n");
		System.out.print("		Printed from View Controller\n");
		System.out.print("__________________________________________________________\n");
		return "index";
	}

}
