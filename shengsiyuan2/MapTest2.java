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
		
		//��Ϊkey�ǲ����ظ��ģ�����set,���Է���������set
		Set set = map.keySet(); //����key�ļ���
		
		for(Iterator iter = set.iterator(); iter.hasNext();)//����ȡ��Key�ļ������Ԫ��
		{
			String key = (String)iter.next(); //ȡ��key
			String value = (String)map.get(key); //ͨ��key�Ĺ���ӳ���value
			
			System.out.println(key + "=" + value);
		}
	}
}
