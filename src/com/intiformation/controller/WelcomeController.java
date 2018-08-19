package com.intiformation.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller //declare la classe comme bean dans le conteneur
public class WelcomeController {
	/**
	 * méthode gestionnaire
	 * @return
	 */
	@RequestMapping(value="/welcome", method=RequestMethod.GET) //associe a la méthode Http GET
	public ModelAndView accueillir() {
		
		//données a retourner vers la vue
		String titre = "Boutique eCommerce";
		String message = "Bienvenue a notre boutique en ligne";
		Date today = new Date();
		
		Map<String , Object> data = new HashMap<>();
		data.put("titreKey", titre);
		data.put("messageKey", message);
		data.put("todayKey", today);
		
		//le nom logique de la vue
		String viewName = "accueil";
		
		//renvoie de l'objet ModelAndView a la servlet de spring
		ModelAndView  modelAndView = new ModelAndView(viewName, data);
	
		return modelAndView;
	}

}
