package org.example.poketrainner.dto;


import lombok.Data;

@Data
public class StatusResponseDTO {
    private String status;
    private String message;

    public StatusResponseDTO(String status, String message) {
        this.status = status;
        this.message = message;
    }

}
