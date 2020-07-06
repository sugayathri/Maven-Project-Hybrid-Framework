package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig()
	{
		File src=new File("./configuration/config.properties");
		try
		{
			FileInputStream f=new FileInputStream(src);
			pro=new Properties();
			pro.load(f);
		}
	catch (Exception e) 
		{
		System.out.println("Exception is:"+e.getMessage());
	}
	}
        public String getApplicationURL()
        {
        	String url=pro.getProperty("baseURl");
        	return url;
        }
        public String getUSername()
        {
        	String username=pro.getProperty("username");
        	return username;
        }
          public String getPassword()
          {
        	  
        	  String password=pro.getProperty("password");
        	  return password;
        	  
          }
}
