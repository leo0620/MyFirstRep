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
		
		Comparator r = Collections.reverseOrder();//Ŀ������ķ������
		
		Collections.sort(list, r);//��һ�������Ǵ�����ļ��ϣ��ڶ�������������Ĺ��򣨷���
		
		for(Iterator iter = list.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next() + " ");
		}
		
		System.out.println();
		
		Collections.shuffle(list);  //ϴ�ƣ���˼�Ǵ���˳��
		
		for(Iterator iter = list.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next() + " ");
		}
		
		System.out.println("minimum value: " + Collections.min(list)); //��С�����Լ����������һ�����ط�����
		System.out.println("maximum value: " + Collections.max(list)); //���
	}
}
