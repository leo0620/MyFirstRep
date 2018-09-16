package com.shengsiyuan2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest2
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		map.put("d", "dd");
		map.put("e", "ee");
		
		//因为key是不能重复的，满足set,所以返回类型是set
		Set set = map.keySet(); //返回key的集合
		
		for(Iterator iter = set.iterator(); iter.hasNext();)//迭代取出Key的集合里的元素
		{
			String key = (String)iter.next(); //取出key
			String value = (String)map.get(key); //通过key的关联映射出value
			
			System.out.println(key + "=" + value);
		}
	}
}
