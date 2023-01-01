package com.misso.votingappbackend.controller;

import com.misso.votingappbackend.entity.Position;
import com.misso.votingappbackend.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
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
        return positionService.getAllPositions();
    }

//    @GetMapping("/get-all")
//    public ArrayList<Position> getAllPositions() {
//        ArrayList<Position> positions = new ArrayList<>();
//        positions.add(new Position("tech",
//                "Technology",
//                "Education",
//                "Team Lead",
//                "settings",
//                "https://misso.org"));
//        positions.add(new Position("java",
//                "Java",
//                "Education",
//                "Officer",
//                "local_cafe",
//                "https://misso.org"));
//        positions.add(new Position("data",
//                "Database",
//                "Education",
//                "Officer",
//                "local_cafe",
//                "https://misso.org"));
//        positions.add(new Position("tran",
//                "Transaction Processing",
//                "Education",
//                "Officer",
//                "local_cafe",
//                "https://misso.org"));
//        return positions;
//    }
}
