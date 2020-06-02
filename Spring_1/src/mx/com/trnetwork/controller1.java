package mx.com.trnetwork;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tienda")
public class controller1 {
	@RequestMapping("/producto")
	public String saluda(Model miModelo) {
		miModelo.addAttribute("message","Hola Spring");
		
		int[] miarreglo= {3,4,5,6,2};
		miModelo.addAttribute("miarray", miarreglo);
		return "shopping";
		
		
	
	
	
	}
}
