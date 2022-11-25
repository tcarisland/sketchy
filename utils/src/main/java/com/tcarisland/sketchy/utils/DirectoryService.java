package com.tcarisland.sketchy.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class DirectoryService {

	public void traverseImageDirectories(String base, List<String> path) {
		System.out.printf("traversing %s%n", base);	
		List<File> directories = Arrays
				.stream(new File(base).listFiles())
				.filter(u -> u.isDirectory())
				.toList();
		List<File> files = Arrays
				.stream(new File(base).listFiles())
				.filter(u -> u.isFile())
				.toList();
		for(File file : files) {
			System.out.printf("%s %s %s %n",
					path.stream().collect(Collectors.joining(" ")),
					base,
					file.toPath().getFileName().toString());
		}
		for(File file : directories) {
			ArrayList<String> innerPath = new ArrayList<String>(path);
			innerPath.add(file.toPath().getFileName().toString());
			traverseImageDirectories(file.getPath(), innerPath);
		}
	}
	
}
