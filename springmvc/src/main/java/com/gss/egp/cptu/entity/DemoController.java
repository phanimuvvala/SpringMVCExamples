package com.gss.egp.cptu.entity;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * @author Phani
 * @date Nov 02, 2018
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

	private static final Logger logger = Logger.getLogger(DemoController.class);
	
	@RequestMapping(value = "/show/{name}", method = RequestMethod.GET)
	public String show(@PathVariable("name") String name, Model model) {
		logger.info("name is " + name);
		Demo demo = new Demo();
		demo.setTitle("Spring MVC4 Demo");
		demo.setName(name);
		
		model.addAttribute(demo);
		return "demo/show";
	}

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String show(Model model) {
		logger.info("show method...");
		Demo demo = new Demo();
		demo.setTitle("Spring MVC4 Demo");
		demo.setName("Heading1");
		model.addAttribute("demo", demo);
		return "demo/show";
	}

}
