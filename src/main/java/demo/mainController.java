package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.repositories.repo;

@RestController
public class mainController {

	@Autowired
	private repo rep;
	
	 @RequestMapping("/findAll")
	    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
	       
	        return rep.findAll().toString();
	    }
}
