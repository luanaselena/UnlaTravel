package com.unla.travelweb.controllers;

import com.unla.travelweb.helpers.ViewRouteHelper;
import com.unla.travelweb.models.UsuarioModel;
import com.unla.travelweb.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    @Qualifier("usuarioService")
    private IUsuarioService usuarioService;

    @GetMapping("")
    public ModelAndView index() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.USUARIO_INDEX);
        mAV.addObject("usuarios", usuarioService.getAll());
        return mAV;
    }

    @GetMapping("/new")
    public ModelAndView create() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.USUARIO_NEW);
        mAV.addObject("usuario", new UsuarioModel());
        return mAV;
    }

    @PostMapping("/create")
    public RedirectView create(@ModelAttribute("usuario") UsuarioModel usuarioModel) {
        usuarioService.insert(usuarioModel);
        return new RedirectView(ViewRouteHelper.USUARIO_ROOT);
    }

    @GetMapping("/{id}")
    public ModelAndView get(@PathVariable("id") long id) {
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.USUARIO_UPDATE);
        mAV.addObject("usuario", usuarioService.findById(id));
        return mAV;
    }


    @PostMapping("/update")
    public RedirectView update(@ModelAttribute("usuario") UsuarioModel usuarioModel) {
        usuarioService.update(usuarioModel);
        return new RedirectView(ViewRouteHelper.USUARIO_ROOT);
    }

    @PostMapping("/delete/{id}")
    public RedirectView delete(@PathVariable("id") long id) {
        usuarioService.remove(id);
        return new RedirectView(ViewRouteHelper.USUARIO_ROOT);
    }
}
