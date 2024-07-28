package com.harshSpringProject.demoPracticeOne;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class demoController {	


	@RequestMapping("/Books")
	public List<Books> mapperFunction (){
		return Arrays.asList(	
				new Books(1,"Night of the living dummy","R.L Stine"),
				new Books(2,"Alchemist","Paulo Coelho"),
				new Books(3,"Informatics Pracitces","Sumitra Arora")
				
				);
	}
}
