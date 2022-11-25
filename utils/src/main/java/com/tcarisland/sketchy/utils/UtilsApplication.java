package com.tcarisland.sketchy.utils;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UtilsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilsApplication.class, args);
	}
	
	private DirectoryService directoryService;
	private SketchyProperties props;
	
	public UtilsApplication(@Autowired DirectoryService directoryService, @Autowired SketchyProperties properties) {		
		this.directoryService = directoryService;
		this.props = properties;
	}
	
	@PostConstruct
	public void doAfterInit() {
		System.out.println("HELLO THOR!");
		directoryService.traverseImageDirectories(props.getBaseDir(), new ArrayList<String>());
	}

}
