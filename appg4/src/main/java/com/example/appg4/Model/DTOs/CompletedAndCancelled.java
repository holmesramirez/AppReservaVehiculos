package com.example.appg4.Model.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompletedAndCancelled {
    private Long completed;
    private Long cancelled;
}
