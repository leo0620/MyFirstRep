package com.shengsiyuan2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest3
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		//��¼args[]�����ﵥ�ʳ��ֵĴ�����keyΪ���ʣ�valueΪ���ִ���
		for(int i=0;i<args.length;i++)
		{
			if(map.get(args[i]) == null) //û�й�������null������һ�Σ���ǰkey��û�д��HashMap,��û�й���value
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
