package com.misso.votingappbackend.service;

import com.misso.votingappbackend.entity.Position;
import com.misso.votingappbackend.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService {

    @Autowired
    private PositionRepository positionRepository;

    public Iterable<Position> getAllPositions() {
        return positionRepository.findAll();
    }

    public Position getPositionById(int id) {
        return positionRepository.findById(id).orElse(null);
    }
}
