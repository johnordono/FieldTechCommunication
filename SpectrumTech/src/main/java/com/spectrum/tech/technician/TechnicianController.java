package com.spectrum.tech.technician;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TechnicianController {

    @Autowired
    private TechnicianService technicianService;

    @RequestMapping("/")
    String home(){ return "home"; }

    @RequestMapping("/technician")
    public List<Technician> getAllTechnicians(){ return technicianService.getAllTechnicians(); }

    @RequestMapping("/technician/{id}")
    public Technician getTechnicians(@PathVariable String id){ return technicianService.getTechnician(id); }

    @RequestMapping(method=RequestMethod.POST, value="/technician")
    public void addTechnician(@RequestBody Technician technician){ technicianService.addTechnician(technician); }

    @RequestMapping(method=RequestMethod.PUT, value="/technician/{id}")
    public  void updateTechnician(@RequestBody Technician technician, @PathVariable String id){
        technicianService.updateTechnician(id, technician);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/technician/{id}")
    public void deleteTechnician(@PathVariable String id) { technicianService.deleteTechnician(id); }

}
