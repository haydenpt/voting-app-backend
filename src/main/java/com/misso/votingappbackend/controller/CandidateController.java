package com.misso.votingappbackend.controller;

import com.misso.votingappbackend.model.Candidate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@CrossOrigin(origins = "http://localhost:4200")
@RestController()
@RequestMapping("/candidates")
public class CandidateController {

    @GetMapping
    public ArrayList<Candidate> getAllCandidates() {
        ArrayList<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("1992259", "tech1", "tech", new Date()));
        candidates.add(new Candidate("1992251", "tech2", "tech", new Date()));
        candidates.add(new Candidate("1234567", "java1", "java", new Date()));
        return candidates;
    }

    @GetMapping("/{positionId}")
    public ArrayList<Candidate> getPositionCandidate(@PathVariable String positionId) {
        ArrayList<Candidate> candidatesTech = new ArrayList<>();
        ArrayList<Candidate> candidatesJava = new ArrayList<>();
        candidatesTech.add(new Candidate("1992259", "tech1", "tech", new Date()));
        candidatesTech.add(new Candidate("1992251", "tech2", "tech", new Date()));
        candidatesJava.add(new Candidate("1234567", "java1", "java", new Date()));

        if ("tech".equalsIgnoreCase(positionId)) {
            return candidatesTech;
        } else {
            return candidatesJava;
        }
    }
}
