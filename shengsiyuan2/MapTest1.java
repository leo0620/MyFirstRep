package com.shengsiyuan2;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

public class MapTest1
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		map.put("a","zhangsan");//第一参数是key(键的信息)，第二个参数是key所关联（映射的）value
		map.put("b","lisi");  //每一个Key只能关联（映射）一个value
		map.put("c","wangwu");
		map.put("a","zhaoliu");//key不能重复，若key相同的，后者会把前者的value替换掉
		
		System.out.println(map);
		
		String str = (String)map.get("b"); //get()方法返回的是Object类型，要强转
		System.out.println(str);
				
		String str2 = (String)map.get("d");  //没有对应的value返回null
		System.out.println(str2);
		
		
	}
}
