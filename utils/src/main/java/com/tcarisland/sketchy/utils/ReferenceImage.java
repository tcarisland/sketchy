package com.tcarisland.sketchy.utils;

import java.nio.file.Path;
import java.util.List;

import lombok.Data;

@Data
public class ReferenceImage {
	
	@TypescriptDefinition(type = TypescriptTypes.TS_ARRAY)
	private List<String> tags;
	private String name;
	private Path path;
	private String base64Url;

}
