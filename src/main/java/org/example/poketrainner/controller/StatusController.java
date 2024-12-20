package org.example.poketrainner.controller;

import org.example.poketrainner.dto.StatusResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {
    @GetMapping
    public ResponseEntity<StatusResponseDTO> getStatus() {
        return ResponseEntity.status(HttpStatus.OK).body(new StatusResponseDTO("success", "ok"));
    }
}
