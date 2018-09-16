package com.shengsiyuan3;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest
{
	public static void main(String[] args)
	{
		Properties p = System.getProperties();//Hashtable的子类，用来保持值的列表
		
		Set set = p.keySet();
		
		//或者系统的环境变量
		for(Iterator iter = set.iterator(); iter.hasNext();)
		{
			String key = (String)iter.next();
			String value = p.getProperty(key);
			
			System.out.println(key + "=" + value);
		}
	}
}
