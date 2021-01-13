package madak.org.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import madak.org.com.dao.AlienDao;
import madak.org.com.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienDao dao;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addalien")
	public String addAlien(Alien alien) {
		dao.save(alien);
	
		return "home.jsp";
	}
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		
		ModelAndView mv=new ModelAndView("view.jsp");
		Alien alien = dao.findById(aid).orElse(null);
		mv.addObject(alien);
		return mv;
	}
	@RequestMapping("/deleteAlien")
	public String deleteAlien(@RequestParam int aid) {
		dao.deleteById(aid);
		return "home.jsp";
	}
	
}
