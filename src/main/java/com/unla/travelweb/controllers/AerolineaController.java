package com.unla.travelweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.travelweb.entities.Actividad;
import com.unla.travelweb.entities.Aerolinea;
import com.unla.travelweb.entities.CalificacionActividad;
import com.unla.travelweb.entities.CalificacionAerolinea;
import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.ActividadModel;
import com.unla.travelweb.models.AerolineaModel;
import com.unla.travelweb.models.Functions;
import com.unla.travelweb.services.IAerolineaService;
import com.unla.travelweb.services.ICalificacionAerolineaService;

@Controller
@RequestMapping("/aerolinea")
public class AerolineaController {

	@Autowired
	@Qualifier("aerolineaService")
	private IAerolineaService aerolineaService;

	@Autowired
	@Qualifier("calificacionAerolineaService")
	private ICalificacionAerolineaService calificacionAerolineaService;

	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.AEROLINEA_INDEX);
		for (Aerolinea a : aerolineaService.getAll()) {
			a.setValoracion(Functions.valoracionesXaerolinea(a, calificacionAerolineaService.getAll()));
			;
		}
		mAV.addObject("aerolineas", aerolineaService.getAll());
		return mAV;
	}

	@GetMapping("/new")
	public ModelAndView create() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.AEROLINEA_NEW);
		mAV.addObject("aerolinea", new AerolineaModel());
		return mAV;
	}

	@PostMapping("/create")
	public ModelAndView create(@ModelAttribute("aerolinea") AerolineaModel aerolineaModel) {
		aerolineaModel.setValoracion(aerolineaModel.getValoracion()/10);
		aerolineaService.insert(aerolineaModel);
		return new ModelAndView("redirect:/aerolinea");
	}

	@GetMapping("/{id}")
	public ModelAndView get(@PathVariable("id") long id) {
	        ModelAndView mAV = new ModelAndView(ViewRouteHelper.AEROLINEA_UPDATE);
	        mAV.addObject("aerolinea", aerolineaService.findById(id));
	        return mAV;
	}

	@PostMapping("/update")
	public RedirectView update(@ModelAttribute("aerolinea") AerolineaModel aerolineaModel) {
		aerolineaService.update(aerolineaModel);
		return new RedirectView(ViewRouteHelper.AEROLINEA_ROOT);
	}

	@PostMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") long id) {
		aerolineaService.remove(id);
		return new RedirectView(ViewRouteHelper.AEROLINEA_ROOT);
	}

	

}
