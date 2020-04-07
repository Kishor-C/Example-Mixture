package com.examples;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFileReading {

	public static void main(String[] args) throws Exception {
		Path p = Paths.get("D:\\Demo");
		try (Stream<Path> stream = Files.walk(p, 5)) {
			stream.forEach(x -> System.out.println(x));
		}
	}
}
