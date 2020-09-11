package com.examples.core.iostreams;
import java.io.*;
public class TestReadWrite
{
	public static void main(String[] arg)
	{
		try
		{
			FileInputStream fis = new FileInputStream(arg[0]);
			FileOutputStream fos = new FileOutputStream(arg[1]);
			int code = 0;
			while( (code = fis.read()) != -1)
			{
				fos.write(code);
			}
			fos.flush();
			fis.close();
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
}