package com.example.appg4.Model.DTOs;

import com.example.appg4.Model.Client;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TotalAndClient {
    private Long total;

    private Client client;
}
