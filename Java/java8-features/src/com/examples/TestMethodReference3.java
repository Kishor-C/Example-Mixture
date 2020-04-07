package com.examples;

import java.io.File;
import java.io.FileFilter;

interface Calci {
	int operation(int x, int y);
}

public class TestMethodReference3 {
	public static void main(String[] args) {
		File[] hiddenFiles = new File("C:\\").listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isHidden();
			}
		});
		System.out.println("Hidden Files: "+hiddenFiles.length);
		File[] directories = new File("C:\\").listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isDirectory();
			}
		});
		System.out.println("Directories: "+directories.length);	
		System.out.println("Through Method Reference");
		File[] anotherHidden = new File("C:\\").listFiles(File :: isHidden);
		System.out.println("Hidden Files: "+anotherHidden.length);
		Calci c1 = Math :: max;
		Calci c2 = Math :: min;
		int result = c1.operation(20, 30);
		result = c2.operation(20, 30);
	}
}
