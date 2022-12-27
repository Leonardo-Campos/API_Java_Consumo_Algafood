package com.algaworks.algafood.client.model;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class Problem {

    private Integer status;
    private OffsetDateTime timeStamp;
    private String userMessage;
}
