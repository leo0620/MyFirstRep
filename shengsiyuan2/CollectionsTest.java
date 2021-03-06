package com.shengsiyuan2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsTest
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		
		list.add(new Integer(-8));
		list.add(new Integer(20));
		list.add(new Integer(-20));
		list.add(new Integer(8));
		
		Comparator r = Collections.reverseOrder();//目标数组的反序操作
		
		Collections.sort(list, r);//第一个参数是待排序的集合，第二个参数是排序的规则（反序）
		
		for(Iterator iter = list.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next() + " ");
		}
		
		System.out.println();
		
		Collections.shuffle(list);  //洗牌，意思是打乱顺序
		
		for(Iterator iter = list.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next() + " ");
		}
		
		System.out.println("minimum value: " + Collections.min(list)); //最小，可以加入排序规则（一个重载方法）
		System.out.println("maximum value: " + Collections.max(list)); //最大
	}
}
