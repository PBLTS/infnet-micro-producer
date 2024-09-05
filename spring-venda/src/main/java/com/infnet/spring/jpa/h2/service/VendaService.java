package com.infnet.spring.jpa.h2.service;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infnet.spring.jpa.h2.model.Vendas;

@Service
public class VendaService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void realiza_venda( Vendas objVenda){

        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(objVenda);

            rabbitTemplate.convertAndSend(this.queue.getName(), json);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        

    }

}
