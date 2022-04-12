package com.estudo.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.hrpayroll.entities.Payment;
import com.estudo.hrpayroll.entities.Worker;
import com.estudo.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody(); //pega o corpo da mensagem
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
	}
	
}
