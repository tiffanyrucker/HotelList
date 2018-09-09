package com.hotellab.demo.HotelList;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.stereotype.Controller;
/*import org.springframework.ui.Model;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*import org.springframework.web.bind.annotation.RequestParam;*/
import org.springframework.web.servlet.ModelAndView;

import com.hotellab.demo.HotelList.dao.HotelsRepository;

/*import com.hotellab.demo.HotelList.dao.HotelDao;
import com.hotellab.demo.HotelList.entity.Hotel;
*/
@Controller
public class HotelController {
	
	@Autowired
	HotelsRepository hRep;

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView ("index");
		//model.addAttribute("list", h.findAll());
	
		return mv;
	}
	
	@RequestMapping("formdata")
	public ModelAndView formData(@RequestParam("city") String city1) {
//		String[] vehicles = vehicle1.split(",");
//		System.out.println(vehicles[0]);
		return new ModelAndView("form","city1", hRep.findByCity(city1));
	}

	
	/*@RequestMapping("/search")
	public ModelAndView search(@RequestParam("city") String city) {
		Hotel h = h.getCity(city);
		System.out.println(hotel);

		return new ModelAndView("search", "hotel", h1);
	}*/
	
}
