package com.misso.votingappbackend.controller;

import com.misso.votingappbackend.entity.Position;
import com.misso.votingappbackend.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController()
@RequestMapping("/positions")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping("/get-all")
    public Iterable<Position> getAllPositions() {
        System.out.println(SecurityContextHolder.getContext().getAuthentication());
        return positionService.getAllPositions();
    }

}
