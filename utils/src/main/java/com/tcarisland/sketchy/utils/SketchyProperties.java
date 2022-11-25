package com.tcarisland.sketchy.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class SketchyProperties {

	@Value("${baseDir:../../}")
	private String baseDir;
	
}
