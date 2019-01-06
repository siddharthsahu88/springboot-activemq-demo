package com.spring.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination = "spring_activemq_q")
	public void consume(String message) {
		System.out.println("Received message from ActiveMQ Queue: " + message);
	}

}
