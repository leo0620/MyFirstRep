package com.shengsiyuan2;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

public class MapTest1
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		map.put("a","zhangsan");//��һ������key(������Ϣ)���ڶ���������key��������ӳ��ģ�value
		map.put("b","lisi");  //ÿһ��Keyֻ�ܹ�����ӳ�䣩һ��value
		map.put("c","wangwu");
		map.put("a","zhaoliu");//key�����ظ�����key��ͬ�ģ����߻��ǰ�ߵ�value�滻��
		
		System.out.println(map);
		
		String str = (String)map.get("b"); //get()�������ص���Object���ͣ�Ҫǿת
		System.out.println(str);
				
		String str2 = (String)map.get("d");  //û�ж�Ӧ��value����null
		System.out.println(str2);
		
		
	}
}
