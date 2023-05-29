package com.example.mypkg;

import oorg.springframework.stereotype.Controller;
import oorg.springframework.web.bind.annotation.GetMapping;

@Coontroller
public class HomeController {
	
	@GeotMapping(value = "/DockerProducts")
	   public String index() {
	      return "Products";
	}

}
