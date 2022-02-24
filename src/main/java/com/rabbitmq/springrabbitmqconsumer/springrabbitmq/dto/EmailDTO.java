package com.rabbitmq.springrabbitmqconsumer.springrabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmailDTO {
    private String uuid;
    private Date data;
    private String assunto;
    private String conteudo;
    private List<String> destinatarios;
}
