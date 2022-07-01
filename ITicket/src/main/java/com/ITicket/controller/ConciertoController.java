/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITicket.controller;

import com.ITicket.entity.Artista;
import com.ITicket.entity.Concierto;
import com.ITicket.service.IArtistaService;
import com.ITicket.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Jeffrey Simpson
 */
@Controller
public class ConciertoController {

    @Autowired
    private IConciertoService conciertoService;
    @Autowired
    private IArtistaService artistaService;

    @GetMapping("/concierto") // cuando escribamos un URL (conteniendo el /persona), el va a saber que es lo que tiene que hacer... es el URL del dibujo
    public String index(Model model) { // model es un obj que permite pasar la info o variables al HTML de personas
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla Conciertos");
        model.addAttribute("artistas", listaConcierto);
        return "conciertos"; //devuelve una pagina web o HTML que se llama personas
    }

    @GetMapping("/conciertosN")
    public String crearConcierto(Model model) {
        List<Artista> listaArtistas = artistaService.listArtista();
        model.addAttribute("concierto", new Concierto());
        model.addAttribute("artistas", listaArtistas);
        return "crear";
    }

    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute Concierto concierto) {
        conciertoService.saveConcierto(concierto); // con esto se guarda en la base de datos
        return "redirect:/concierto";// redirije hacia una pagina, a otro get mapping, hacia la tabla de personas para verificar que si se guardo bien el cambio
    }

    @GetMapping("/editConcierto/{id}")
    public String editarConcierto(@PathVariable("id") Long idConcierto, Model model) {
        Concierto concierto = conciertoService.getConciertoById(idConcierto);
        List<Artista> listaArtistas = artistaService.listArtista();
        model.addAttribute("concierto", concierto);
        model.addAttribute("artistas", listaArtistas);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminarConcierto(@PathVariable("id") Long idConcierto) {
        conciertoService.delete(idConcierto);
        return "redirect:/concierto";
    }

}
