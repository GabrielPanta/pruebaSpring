package com.example.springPrueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPruebaApplication {
    
    @GetMapping("/saludar")
    public String Saludar(){
        return "Hola Fucking World";
    }
    
     @GetMapping("/insultar")
    public String Insultar(){
        return "Hello mother fucker";
    }
    
/*Hola quedó Gabo*/
	public static void main(String[] args) {
		SpringApplication.run(SpringPruebaApplication.class, args);
	}
/*dsfsfsf*/
}
