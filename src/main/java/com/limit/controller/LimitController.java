package com.limit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limit.bean.Limits;
import com.limit.configuration.Congifuration;

@RestController
@RequestMapping("/api")
public class LimitController {
	@Autowired
	private Congifuration congifuration;
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(congifuration.getMinimum(),congifuration.getMaximum());
		//return new Limits(1,500);
	}

}
