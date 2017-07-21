package com.spectrum.tech.technician;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TechnicianService {

    @Autowired
    private TechnicianRepository technicianRepository;

    public List<Technician> getAllTechnicians(){
        List<Technician> technicians = new ArrayList<>();
        technicianRepository.findAll()
        .forEach(technicians::add);
        return technicians;
    }

    public Technician getTechnician(String id){
        return technicianRepository.findOne(id);
    }

    public void addTechnician(Technician technician){
        technicianRepository.save(technician);
    }

    public void updateTechnician(String id, Technician technician){
        technicianRepository.save(technician);
    }

    public void deleteTechnician(String id){
        technicianRepository.delete(id);
    }
}
