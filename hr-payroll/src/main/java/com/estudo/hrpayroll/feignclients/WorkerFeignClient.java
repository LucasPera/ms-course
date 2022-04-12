package com.estudo.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.estudo.hrpayroll.entities.Worker;

@Component //é um componente gerenciado pelo spring
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers") //conecta ao outro microserviço
public interface WorkerFeignClient {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);
	
}
