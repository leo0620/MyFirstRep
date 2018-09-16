package com.shengsiyuan2;

import java.util.LinkedList;

public class MyQueue
{
private LinkedList list = new LinkedList();
	
	public void put(Object o)  //把元素放入队列
	{
		list.addLast(o);
	}
	
	public Object get() //取出来并删除
	{
		return list.removeFirst();//移除并返回此列表的第一个元素
	}
	
	public boolean isEmpty()  //判断队列是否为空
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
