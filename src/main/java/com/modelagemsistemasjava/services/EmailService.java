package com.modelagemsistemasjava.services;

import org.springframework.mail.SimpleMailMessage;

import com.modelagemsistemasjava.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
