package com.shengsiyuan2;

import java.util.LinkedList;

public class MyQueue
{
private LinkedList list = new LinkedList();
	
	public void put(Object o)  //��Ԫ�ط������
	{
		list.addLast(o);
	}
	
	public Object get() //ȡ������ɾ��
	{
		return list.removeFirst();//�Ƴ������ش��б�ĵ�һ��Ԫ��
	}
	
	public boolean isEmpty()  //�ж϶����Ƿ�Ϊ��
	{
		return list.isEmpty();
	}
	
	public static void main(String[] args)
	{
		MyQueue myQueue = new MyQueue();
		
		myQueue.put("one");
		myQueue.put("two");
		myQueue.put("three");
		
		System.out.println(myQueue.get());
		System.out.println(myQueue.get());
		System.out.println(myQueue.get());
		
		System.out.println(myQueue.isEmpty());
		
	}
}
