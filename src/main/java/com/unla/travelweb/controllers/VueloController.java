package com.unla.travelweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.sql.Date;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.SimpleDateFormat;

import org.springframework.format.annotation.DateTimeFormat;

import com.unla.travelweb.converters.ClaseConverter;
import com.unla.travelweb.converters.DestinoConverter;
import com.unla.travelweb.entities.Aerolinea;
import com.unla.travelweb.entities.CalificacionAerolinea;
import com.unla.travelweb.entities.Vuelo;
import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.AerolineaModel;
import com.unla.travelweb.models.ClaseModel;
import com.unla.travelweb.models.DestinoModel;
import com.unla.travelweb.models.Functions;
import com.unla.travelweb.models.VueloModel;
import com.unla.travelweb.services.IAerolineaService;
import com.unla.travelweb.services.ICalificacionAerolineaService;
import com.unla.travelweb.services.IClaseService;
import com.unla.travelweb.services.IDestinoService;
import com.unla.travelweb.services.IVueloService;

@Controller
@RequestMapping("/vuelo")
public class VueloController {
	
	@Autowired
	@Qualifier("vueloService")
	private IVueloService vueloService;

	@Autowired
	@Qualifier("destinoService")
	private IDestinoService destinoService;
	
	@Autowired
	@Qualifier("claseService")
	private IClaseService claseService;
	
	@Autowired
	@Qualifier("aerolineaService")
	private IAerolineaService aerolineaService;
	
	@Autowired
	@Qualifier("calificacionAerolineaService")
	private ICalificacionAerolineaService calificacionAerolineaService;
	
	@Autowired
	@Qualifier ("claseConverter")
	private ClaseConverter claseConverter;
	
	@Autowired
	@Qualifier("destinoConverter")
	private DestinoConverter destinoConverter;
	
	@GetMapping("")
    public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.VUELO_INDEX);
        for(Vuelo v : vueloService.getAll()) {
        	v.setPrecio((int)vueloService.calcularPrecio(4, destinoConverter.entityToModel(v.getOrigen()), destinoConverter.entityToModel(v.getDestino()), claseConverter.entityToModel(v.getClase()), v.getCantPersonas()));;
        }
        mAV.addObject("vuelos", vueloService.getAll());
        return mAV;
    }

    @GetMapping("/new")
    public ModelAndView create() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.VUELO_NEW);
        mAV.addObject("vuelo", new VueloModel());
        mAV.addObject("destinos", destinoService.getAll());
        for(Aerolinea a : aerolineaService.getAll()) {
        	a.setValoracion(Functions.valoracionesXaerolinea(a, calificacionAerolineaService.getAll()));;
        }
        mAV.addObject("aerolineas", aerolineaService.getAll());
        mAV.addObject("clases", claseService.getAll());

        return mAV;
    }

    @PostMapping("/create")
    public RedirectView create(@ModelAttribute("vuelo") VueloModel vueloModel) {
    	System.out.println("pene");
    	vueloModel.setOrigen(destinoService.findById(vueloModel.getOrigen().getId()));
    	vueloModel.setDestino(destinoService.findById(vueloModel.getDestino().getId()));
    	vueloModel.setAerolinea(aerolineaService.findById(vueloModel.getAerolinea().getId()));
    	vueloModel.setClase(claseService.findById(vueloModel.getClase().getId()));
    	vueloModel.setPrecio(Math.round(vueloService.calcularPrecio(4, vueloModel.getOrigen(), vueloModel.getDestino(), vueloModel.getClase(),vueloModel.getCantPersonas())));
    	System.out.println(vueloModel);
    	vueloService.insert(vueloModel);

    	System.out.println("pen2sse");
        return new RedirectView(ViewRouteHelper.VUELO_ROOT);
    }

    @GetMapping("/{id}")
    public ModelAndView get(@PathVariable("id") long id) {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.VUELO_UPDATE);
        mAV.addObject("vuelo", vueloService.findById(id));
        mAV.addObject("destinos", destinoService.getAll());
        mAV.addObject("aerolineas", aerolineaService.getAll());
        mAV.addObject("clases", claseService.getAll());
        return mAV;
    }

    @PostMapping("/update")
    public RedirectView update(@ModelAttribute("vuelo") VueloModel vueloModel) {
    	vueloModel.setOrigen(destinoService.findById(vueloModel.getOrigen().getId()));
    	vueloModel.setDestino(destinoService.findById(vueloModel.getDestino().getId()));
    	vueloModel.setAerolinea(aerolineaService.findById(vueloModel.getAerolinea().getId()));
    	vueloModel.setClase(claseService.findById(vueloModel.getClase().getId()));
    	vueloModel.setPrecio(Math.round(vueloService.calcularPrecio(4, vueloModel.getOrigen(), vueloModel.getDestino(), vueloModel.getClase(),vueloModel.getCantPersonas())));
    	vueloService.update(vueloModel);
        return new RedirectView(ViewRouteHelper.VUELO_ROOT);
    }

    @PostMapping("/delete/{id}")
    public RedirectView delete(@PathVariable("id") long id) {
    	vueloService.remove(id);
        return new RedirectView(ViewRouteHelper.VUELO_ROOT);
    } 
    
    @InitBinder     
    public void initBinder(WebDataBinder binder){
         binder.registerCustomEditor(Date.class,     
                             new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));   
    }
    
}
