package com.shengsiyuan2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest3
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		//记录args[]数组里单词出现的次数，key为单词，value为出现次数
		for(int i=0;i<args.length;i++)
		{
			if(map.get(args[i]) == null) //没有关联返回null，即第一次，当前key还没有存进HashMap,还没有关联value
			{
				map.put(args[i],new Integer(1));
			}
			else
			{
				Integer in = (Integer)map.get(args[i]);
				in = new Integer(in.intValue()+1);
				map.put(args[i],in);
			}
		}
		
		Set set = map.keySet();
		for(Iterator iterator = set.iterator();iterator.hasNext();)
		{
			String key = (String)iterator.next();
			Integer value = (Integer)map.get(key);
			System.out.println(key + " : " + value);
		}

	}
}
