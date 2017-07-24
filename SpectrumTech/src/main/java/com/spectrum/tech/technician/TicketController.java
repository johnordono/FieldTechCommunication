package com.spectrum.tech.technician;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping("/ticket")
    public List<Ticket> getAllTickets(){ return ticketService.getAllTickets();}

    @RequestMapping("/ticket/{id}")
    public Ticket getTicket(@PathVariable String id){ return ticketService.getTicket(id);}

    @RequestMapping(method= RequestMethod.POST, value="/ticket")
    public void addTicket(@RequestBody Ticket ticket){ ticketService.addTicket(ticket);}

    @RequestMapping(method=RequestMethod.PUT, value="/ticket/{id}")
    public void updateTicket(@RequestBody Ticket ticket, @PathVariable String id){
        ticketService.updateTicket(id, ticket);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/ticket/{id}")
    public void deleteTicket(@PathVariable String id){ ticketService.deleteTicket(id);}

}
